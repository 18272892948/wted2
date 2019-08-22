package com.blockbus.wted.core.user.dto.fund;

import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class FundQueryDto extends CommonParam implements BaseDto {

    private String id;
    private String code;
    private String name;
    private String buyCurrency;
    private String rewardCurrency;
    private Integer status;
}
