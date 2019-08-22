package com.blockbus.wted.core.user.dto.exchange;

import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExchangeExecuteDto implements BaseDto {
    private String exchangeId;
    private BigDecimal amount;
}
