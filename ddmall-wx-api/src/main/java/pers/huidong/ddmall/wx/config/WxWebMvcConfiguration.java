package pers.huidong.ddmall.wx.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pers.huidong.ddmall.wx.annotation.support.LoginUserHandlerMethodArgumentResolver;

import java.util.List;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2021/1/10 22:34
 * @Version: 1.0
 */
@Configuration
public class WxWebMvcConfiguration implements WebMvcConfigurer {
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
        argumentResolvers.add(new LoginUserHandlerMethodArgumentResolver());
    }
}
