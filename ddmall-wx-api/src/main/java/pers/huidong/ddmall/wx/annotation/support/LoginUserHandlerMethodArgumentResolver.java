package pers.huidong.ddmall.wx.annotation.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import pers.huidong.ddmall.wx.annotation.LoginUser;
import pers.huidong.ddmall.wx.util.JwtOperator;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2021/1/10 22:33
 * @Version: 1.0
 */
public class LoginUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Autowired
    private JwtOperator jwtOperator;

    public static final String LOGIN_TOKEN_KEY = "X-Ddmall-Token";
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterType().isAssignableFrom(Integer.class)&&methodParameter.hasParameterAnnotation(LoginUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        String token = nativeWebRequest.getHeader(LOGIN_TOKEN_KEY);
        if ((token==null||token.isEmpty())){
            return null;
        }
        return jwtOperator.getClaimsFromToken(token);
    }
}
