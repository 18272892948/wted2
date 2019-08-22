package com.blockbus.wted.core.user.dto.fund;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class FundUpdateDto {
    private String id;
    private String code;
    private String name;
    private Integer type;
    private String buyCurrency;
    private String fundBackCurrency;
    private BigDecimal minBalance;
    private Integer queryStatus;
    private Integer updateStatus;
    private String content;

}
