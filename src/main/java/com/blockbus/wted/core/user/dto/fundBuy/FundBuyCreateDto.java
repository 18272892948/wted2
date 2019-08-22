package com.blockbus.wted.core.user.dto.fundBuy;


import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class FundBuyCreateDto implements BaseDto {
    private String code;
    private BigDecimal amount;
}
