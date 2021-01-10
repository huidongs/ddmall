package pers.huidong.ddmall.core.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2021/1/10 13:08
 * @Version: 1.0
 */
@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "ddmall.wx")
public class WxProperties {

    private String appId;

    private String appSecret;

    private String mchId;

    private String mchKey;

    private String notifyUrl;

    private String keyPath;
}
