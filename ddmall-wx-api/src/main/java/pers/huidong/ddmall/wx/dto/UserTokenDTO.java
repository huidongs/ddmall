package pers.huidong.ddmall.wx.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserTokenDTO {
    private Integer userId;
    private String token;
    private String sessionKey;
    private LocalDateTime expireTime;
    private LocalDateTime updateTime;


}
