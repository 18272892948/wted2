package com.blockbus.wted.core.user.dto.order;

import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderCreateDto implements BaseDto {

    private Integer orderType;
    private BigDecimal amount;
    private String currency;
    private String content;
}
