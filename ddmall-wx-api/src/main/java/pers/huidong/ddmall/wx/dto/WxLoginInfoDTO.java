package pers.huidong.ddmall.wx.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WxLoginInfoDTO {
    private String code;
    private UserInfoDTO userInfo;

}
