package com.blockbus.wted.core.user.dto.account;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountWhere {
    private String userId;
    private String currency;
    private BigDecimal usableBalance;
    private BigDecimal frozenBalance;

}
