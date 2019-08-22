package com.blockbus.wted.core.user.dto.user;

import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class UserRegistDto implements BaseDto {
    private String userName;
    private String pwd;
    private String mobileCode;
    private String introduceCode;
}
