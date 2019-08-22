package com.blockbus.wted.core.user.dto.account;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountSet{
    private BigDecimal subUsableBalance;
    private BigDecimal addUsableBalance;
    private BigDecimal subFrozenBalance;
    private BigDecimal addFrozenBalance;
}
