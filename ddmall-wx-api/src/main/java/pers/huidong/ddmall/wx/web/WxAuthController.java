package pers.huidong.ddmall.wx.web;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;


import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pers.huidong.ddmall.core.util.IpUtil;
import pers.huidong.ddmall.core.util.ResponseUtil;
import pers.huidong.ddmall.db.domain.DdmallUser;
import pers.huidong.ddmall.db.service.DdmallUserService;
import pers.huidong.ddmall.wx.dto.UserInfoDTO;
import pers.huidong.ddmall.wx.dto.WxLoginInfoDTO;
import pers.huidong.ddmall.wx.util.JwtOperator;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

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

    /**
     * 微信登录
     *
     * @param wxLoginInfoDTO 请求内容，{ code: xxx, userInfo: xxx }
     * @param wxLoginInfoDTO 请求对象
     * @return 登录结果
     */
    @PostMapping("login_by_weixin")
    public Object loginByWeixin(@RequestBody WxLoginInfoDTO wxLoginInfoDTO, HttpServletRequest request) {
        log.info("获取前端传来的信息：{}", wxLoginInfoDTO);
        String code = wxLoginInfoDTO.getCode();
        UserInfoDTO userInfo = wxLoginInfoDTO.getUserInfo();
        log.info("userInfo：{}", userInfo);
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
            user = DdmallUser.builder()
                    .lastLoginTime(LocalDateTime.now())
                    .lastLoginIp(IpUtil.getIpAddr(request))
                    .sessionKey(sessionKey)
                    .build();
            if (userService.updateByUser(user) == 0) {
                return ResponseUtil.updatedDataFailed();
            }
        }
        //将userInfo转化成Map类型，因为该jwt工具类需要
        ObjectMapper mapper = new ObjectMapper();
        Map mapUserInfo = null;
        try {
            String json = mapper.writeValueAsString(userInfo);
            mapUserInfo = mapper.readValue(json,Map.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // token
        String token = jwtOperator.generateToken((mapUserInfo));

        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("token", token);
        result.put("userInfo", userInfo);
        return ResponseUtil.ok();
    }
}
