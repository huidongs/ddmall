package pers.huidong.ddmall.wx.dto;

import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 验证码实体类，用于缓存验证码发送
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaptchaItemDTO {
    private String phoneNumber;
    private String code;
    private LocalDateTime expireTime;

}