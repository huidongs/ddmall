package pers.huidong.ddmall.wx.web;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.mysql.cj.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pers.huidong.ddmall.core.notify.NotifyService;
import pers.huidong.ddmall.core.notify.NotifyType;
import pers.huidong.ddmall.core.util.*;
import pers.huidong.ddmall.core.util.bcrypt.BCryptPasswordEncoder;
import pers.huidong.ddmall.db.domain.DdmallUser;
import pers.huidong.ddmall.db.service.DdmallUserService;
import pers.huidong.ddmall.wx.annotation.LoginUser;
import pers.huidong.ddmall.wx.dto.UserInfoDTO;
import pers.huidong.ddmall.wx.dto.WxLoginInfoDTO;
import pers.huidong.ddmall.wx.service.CaptchaCodeManager;
import pers.huidong.ddmall.wx.util.JwtOperator;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static pers.huidong.ddmall.wx.util.WxResponseCode.*;

/**
 * @USER: xhd
 * @DATE: 2021-01-08
 * @Desc: 鉴权服务
 */
@RestController
@RequestMapping("/wx/auth")
@Validated
@Slf4j
public class WxAuthController {
    @Autowired
    private JwtOperator jwtOperator;
    @Autowired
    private WxMaService wxService;
    @Autowired
    private DdmallUserService userService;
    @Autowired
    private NotifyService notifyService;


    /**
     * 账号注册
     *
     * @param body    请求内容
     *                {
     *                username: xxx,
     *                password: xxx,
     *                mobile: xxx
     *                code: xxx
     *                }
     *                其中code是手机验证码，目前还不支持手机短信验证码
     * @param request 请求对象
     * @return 登录结果
     * 成功则
     * {
     * errno: 0,
     * errmsg: '成功',
     * data:
     * {
     * token: xxx,
     * tokenExpire: xxx,
     * userInfo: xxx
     * }
     * }
     * 失败则 { errno: XXX, errmsg: XXX }
     */
    @PostMapping("register")
    public Object register(@RequestBody String body, HttpServletRequest request) {
        String username = JacksonUtil.parseString(body, "username");
        String password = JacksonUtil.parseString(body, "password");
        //String code = JacksonUtil.parseString(body, "code");
        String mobile = JacksonUtil.parseString(body, "mobile");
        // 如果是小程序注册，则必须非空,其他情况，可以为空
        String wxCode = JacksonUtil.parseString(body, "wxCode");
        if (StringUtils.isNullOrEmpty(username) || StringUtils.isNullOrEmpty(password) || StringUtils.isNullOrEmpty(mobile)) {
            return ResponseUtil.badArgument();
        }
        List<DdmallUser> userList = userService.queryByUsername(username);
        if (userList.size() > 0) {
            return ResponseUtil.fail(AUTH_NAME_REGISTERED, "用户名已注册");
        }
        userList = userService.queryByMobile(mobile);
        if (userList.size() > 0) {
            return ResponseUtil.fail(AUTH_MOBILE_REGISTERED, "手机号已注册");
        }
        if (!RegexUtil.isMobileSimple(mobile)) {
            return ResponseUtil.fail(AUTH_INVALID_MOBILE, "手机号格式不正确");
        }
        //判断验证码是否正确
//        String cacheCode = CaptchaCodeManager.getCachedCaptcha(mobile);
//        if (StringUtils.isNullOrEmpty(cacheCode) || !cacheCode.equals(code)) {
//            return ResponseUtil.fail(AUTH_CAPTCHA_UNMATCH, "验证码错误");
//        }
        String openId = "";
        // 非空，则是小程序注册,继续验证openid
        if (!StringUtils.isNullOrEmpty(wxCode)) {
            try {
                WxMaJscode2SessionResult result = this.wxService.getUserService().getSessionInfo(wxCode);
                openId = result.getOpenid();
            } catch (WxErrorException e) {
                e.printStackTrace();
                return ResponseUtil.fail(AUTH_OPENID_UNACCESS, "openId获取失败");
            }
            userList = userService.queryByOpenId_account(openId);
            if (userList.size() > 1) {
                return ResponseUtil.serious();
            }
            if (userList.size() == 1) {
                DdmallUser checkUser = userList.get(0);
                String checkUsername = checkUser.getUsername();
                String checkPassword = checkUser.getPassword();
                if (!checkUsername.equals(openId) || !checkPassword.equals(openId)) {
                    return ResponseUtil.fail(AUTH_OPENID_BINDED, "openId已绑定账号");
                }
            }
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(password);
        DdmallUser user = DdmallUser.builder()
                .username(username)
                .password(encodedPassword)
                .mobile(mobile)
                .weixinOpenid(openId)
                .avatar("https://yanxuan.nosdn.127.net/80841d741d7fa3073e0ae27bf487339f.jpg?imageView&quality=90&thumbnail=64x64")
                .nickname(username)
                .gender((byte) 0)
                .userLevel((byte) 0)
                .status((byte) 0)
                .lastLoginTime(LocalDateTime.now())
                .lastLoginIp(IpUtil.getIpAddr(request))
                .build();
        userService.add(user);
        //给新用户发送注册优惠券

        //
        UserInfoDTO userInfoDTO = UserInfoDTO.builder()
                .nickName(username)
                .avatarUrl(user.getAvatar())
                .build();
        //token
        String token = jwtOperator.generateToken(JacksonUtil.classToMap(userInfoDTO));
        Date expirationTime = jwtOperator.getExpirationDateFromToken(token);
        log.info("用户{}注册成功，生成的token = {}，有效期到：{}",
                userInfoDTO.getNickName(),
                token,
                expirationTime
        );
        //
        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("token", token);
        result.put("userInfo", userInfoDTO);
        return ResponseUtil.ok(result);
    }

    /**
     * 账号登录
     *
     * @param body    请求内容，{ username: xxx, password: xxx }
     * @param request 请求对象
     * @return 登录结果
     */
    @PostMapping("login")
    public Object login(@RequestBody String body, HttpServletRequest request) {
        String username = JacksonUtil.parseString(body, "username");
        String password = JacksonUtil.parseString(body, "password");
        if (StringUtils.isNullOrEmpty(username) || StringUtils.isNullOrEmpty(password)) {
            return ResponseUtil.badArgument();
        }
        List<DdmallUser> userList = userService.queryByUsername(username);
        DdmallUser user = null;
        if (userList.size() > 1) {
            return ResponseUtil.serious();
        } else if (userList.size() == 0) {
            return ResponseUtil.fail(AUTH_INVALID_ACCOUNT, "账号不存在");
        } else {
            user = userList.get(0);
        }

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (!encoder.matches(password, user.getPassword())) {
            return ResponseUtil.fail(AUTH_INVALID_ACCOUNT, "账号密码不正确");
        }
        //更新登录情况
        user.setLastLoginTime(LocalDateTime.now());
        user.setLastLoginIp(IpUtil.getIpAddr(request));
        if (userService.updateByUser(user) == 0) {
            return ResponseUtil.updatedDataFailed();
        }
        //userInfoDTO
        UserInfoDTO userInfoDTO = UserInfoDTO.builder()
                .nickName(username)
                .avatarUrl(user.getAvatar())
                .build();
        //token
        String token = jwtOperator.generateToken(JacksonUtil.classToMap(userInfoDTO));
        Date expirationTime = jwtOperator.getExpirationDateFromToken(token);
        log.info("用户{}注册成功，生成的token = {}，有效期到：{}",
                userInfoDTO.getNickName(),
                token,
                expirationTime
        );
        //
        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("token", token);
        result.put("userInfo", userInfoDTO);
        return ResponseUtil.ok(result);
    }

    /**
     * 微信登录
     *
     * @param wxLoginInfoDTO 请求内容，{ code: xxx, userInfo: xxx }
     * @param wxLoginInfoDTO 请求对象
     * @return 登录结果
     */
    @PostMapping("login_by_weixin")
    public Object loginByWeixin(@RequestBody WxLoginInfoDTO wxLoginInfoDTO, HttpServletRequest request) {
        String code = wxLoginInfoDTO.getCode();
        UserInfoDTO userInfo = wxLoginInfoDTO.getUserInfo();
        if (code.isEmpty() || userInfo == null) {
            return ResponseUtil.badArgument();
        }
        String openId = null;
        String sessionKey = null;
        try {
            WxMaJscode2SessionResult result = this.wxService.getUserService().getSessionInfo(code);
            openId = result.getOpenid();
            sessionKey = result.getSessionKey();
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        if (openId == null || sessionKey == null) {
            return ResponseUtil.fail();
        }
        DdmallUser user = userService.queryByOpenId(openId);
        if (user == null) {
            user = DdmallUser.builder()
                    .username(openId)
                    .password(openId)
                    .weixinOpenid(openId)
                    .avatar(userInfo.getAvatarUrl())
                    .nickname(userInfo.getNickName())
                    .gender(userInfo.getGender())
                    .userLevel((byte) 0)
                    .status((byte) 0)
                    .lastLoginTime(LocalDateTime.now())
                    .lastLoginIp(IpUtil.getIpAddr(request))
                    .sessionKey(sessionKey)
                    .build();
            userService.add(user);
            // 新用户发送注册优惠券
        } else {
            user.setLastLoginTime(LocalDateTime.now());
            user.setLastLoginIp(IpUtil.getIpAddr(request));
            user.setSessionKey(sessionKey);
            if (userService.updateByUser(user) == 0) {
                return ResponseUtil.updatedDataFailed();
            }
        }
        // token
        String token = jwtOperator.generateToken(JacksonUtil.classToMap(userInfo));
        Date expirationTime = jwtOperator.getExpirationDateFromToken(token);

        log.info("用户{}登录成功，生成的token = {}，有效期到：{}",
                userInfo.getNickName(),
                token,
                expirationTime
        );
        //
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("token", token);
        result.put("userInfo", userInfo);
        return ResponseUtil.ok(result);
    }

    /**
     * 请求验证码
     *
     * TODO
     * 这里需要一定机制防止短信验证码被滥用
     *
     * @param body 手机号码 { mobile: xxx, type: xxx }
     * @return
     */
    @PostMapping("captcha")
    public Object captcha(@LoginUser Integer userId, @RequestBody String body){
        return null;
    }

    /**
     * 请求注册验证码
     *
     * TODO
     * 这里需要一定机制防止短信验证码被滥用
     *
     * @param body 手机号码 { mobile }
     * @return
     */
    @PostMapping("regCaptcha")
    public Object registerCaptcha(@RequestBody String body) {
        String phoneNumber = JacksonUtil.parseString(body, "mobile");
        if (org.springframework.util.StringUtils.isEmpty(phoneNumber)) {
            return ResponseUtil.badArgument();
        }
        if (!RegexUtil.isMobileSimple(phoneNumber)) {
            return ResponseUtil.badArgumentValue();
        }

        if (!notifyService.isSmsEnable()) {
            return ResponseUtil.fail(AUTH_CAPTCHA_UNSUPPORT, "小程序后台验证码服务不支持");
        }
        String code = CharUtil.getRandomNum(6);
        boolean successful = CaptchaCodeManager.addToCache(phoneNumber, code);
        if (!successful) {
            return ResponseUtil.fail(AUTH_CAPTCHA_FREQUENCY, "验证码未超时1分钟，不能发送");
        }
        notifyService.notifySmsTemplate(phoneNumber, NotifyType.CAPTCHA, new String[]{code});

        return ResponseUtil.ok();
    }

    /**
     * 账号手机号码重置
     *
     * @param body    请求内容
     *                {
     *                password: xxx,
     *                mobile: xxx
     *                code: xxx
     *                }
     *                其中code是手机验证码，目前还不支持手机短信验证码
     * @param request 请求对象
     * @return 登录结果
     * 成功则 { errno: 0, errmsg: '成功' }
     * 失败则 { errno: XXX, errmsg: XXX }
     */
    @PostMapping("resetPhone")
    public Object resetPhone(@LoginUser Integer userId, @RequestBody String body, HttpServletRequest request){
        return null;
    }
    /**
     * 账号信息更新
     *
     * @param body    请求内容
     *                {
     *                password: xxx,
     *                mobile: xxx
     *                code: xxx
     *                }
     *                其中code是手机验证码，目前还不支持手机短信验证码
     * @param request 请求对象
     * @return 登录结果
     * 成功则 { errno: 0, errmsg: '成功' }
     * 失败则 { errno: XXX, errmsg: XXX }
     */
    @PostMapping("profile")
    public Object profile(@LoginUser Integer userId, @RequestBody String body, HttpServletRequest request){
        return null;
    }
    /**
     * 账号密码重置
     *
     * @param body    请求内容
     *                {
     *                password: xxx,
     *                mobile: xxx
     *                code: xxx
     *                }
     *                其中code是手机验证码，目前还不支持手机短信验证码
     * @param request 请求对象
     * @return 登录结果
     * 成功则 { errno: 0, errmsg: '成功' }
     * 失败则 { errno: XXX, errmsg: XXX }
     */
    @PostMapping("reset")
    public Object reset(@RequestBody String body, HttpServletRequest request) {
        String mobile = JacksonUtil.parseString(body,"mobile");
        String password = JacksonUtil.parseString(body,"password");
        String code = JacksonUtil.parseString(body,"code");
        if (StringUtils.isNullOrEmpty(mobile)||StringUtils.isNullOrEmpty(password)||StringUtils.isNullOrEmpty(code)){
            return ResponseUtil.badArgument();
        }
        //判断验证码是否错误
        String cacheCode = CaptchaCodeManager.getCachedCaptcha(mobile);
        if (StringUtils.isNullOrEmpty(cacheCode)||!code.equals(cacheCode)){
            return ResponseUtil.fail(AUTH_CAPTCHA_UNMATCH,"验证码错误");
        }
        //修改密码
        List<DdmallUser> userList = userService.queryByMobile(mobile);
        DdmallUser user = null;
        if (userList.size()>1){
            return ResponseUtil.serious();
        }else if (userList.size()==0){
            return ResponseUtil.fail(AUTH_MOBILE_UNREGISTERED,"手机号未注册");
        }else {
            user = userList.get(0);
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodePassword = encoder.encode(password);
        user.setPassword(encodePassword);

        if (userService.updateByUser(user)==0){
            return ResponseUtil.updatedDataFailed();
        }

        return ResponseUtil.ok();
    }

    /**
     * 微信手机号码绑定
     *
     * @param userId
     * @param body
     * @return
     */
    @PostMapping("bindPhone")
    public Object bindPhone(@LoginUser Integer userId, @RequestBody String body){
        return null;
    }
    @PostMapping("logout")
    public Object logout(@LoginUser Integer userId) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        System.out.println();
        return ResponseUtil.ok();
    }

    @GetMapping("info")
    public Object info(@LoginUser Integer userId){
        return null;
    }
}
