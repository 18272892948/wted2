package com.blockbus.wted.core.user.dto.exchange;

import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class ExchangeQueryDto extends CommonParam implements BaseDto {

    private String id;
    private String code;
    private String name;
    private Integer status;
    private String fromCurrency;
    private String toCurrency;
}
