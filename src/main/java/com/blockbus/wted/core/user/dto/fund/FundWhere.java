package com.blockbus.wted.core.user.dto.fund;

import lombok.Data;


@Data
public class FundWhere {
    private String id;
    private String code;
    private String name;
    private Integer type;
    private Integer status;
}
