package com.blockbus.wted.core.user.dto.costRule;

import lombok.Data;

@Data
public class CostRuleWhere {
    private String id;
    private String code;
    private String name;
    private Integer type;
    private Integer status;
}
