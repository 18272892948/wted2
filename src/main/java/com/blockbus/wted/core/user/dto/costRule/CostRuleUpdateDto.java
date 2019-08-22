package com.blockbus.wted.core.user.dto.costRule;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CostRuleUpdateDto {
    private String id;
    private String code;
    private String name;
    private Integer type;
    private BigDecimal intervalValue;
    private Integer intervalType;
    private BigDecimal start;
    private BigDecimal end;
    private BigDecimal rate;
    private Integer status;
}
