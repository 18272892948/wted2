package com.blockbus.wted.core.user.dto.account;

import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class AccountQueryDto extends CommonParam implements BaseDto {
    private String id;
    private String userId;
    private String currency;
    private String mobileNo;



}
