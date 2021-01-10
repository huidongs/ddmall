package pers.huidong.ddmall.wx.web;

import io.jsonwebtoken.Jwt;
import lombok.extern.slf4j.Slf4j;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pers.huidong.ddmall.core.util.ResponseUtil;
import pers.huidong.ddmall.wx.dto.UserInfoDTO;
import pers.huidong.ddmall.wx.dto.WxLoginInfoDTO;
import pers.huidong.ddmall.wx.util.JwtOperator;

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
    /**
     * 微信登录
     *
     * @param wxLoginInfoDTO 请求内容，{ code: xxx, userInfo: xxx }
     * @param wxLoginInfoDTO 请求对象
     * @return 登录结果
     */
    @PostMapping("login_by_weixin")
    public Object loginByWeixin(@RequestBody WxLoginInfoDTO wxLoginInfoDTO) {
        log.info("获取前端传来的信息：{}", wxLoginInfoDTO);
        String code = wxLoginInfoDTO.getCode();
        UserInfoDTO userInfo = wxLoginInfoDTO.getUserInfo();
        log.info("userInfo：{}", userInfo);
        if (code.isEmpty() || userInfo == null){
            return ResponseUtil.badArgument();
        }

        // token
        String token = jwtOperator.generateToken((Map<String, Object>) userInfo);

        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("token", token);
        result.put("userInfo", userInfo);
        return ResponseUtil.ok();
    }
}
