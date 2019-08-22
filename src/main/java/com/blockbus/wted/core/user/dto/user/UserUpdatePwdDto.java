package com.blockbus.wted.core.user.dto.user;

import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;


@Data
public class UserUpdatePwdDto implements BaseDto {
    private String userName;
    private String oldPwd;
    private String newPwd;
    private String mobileCode;
    private String type;
}
