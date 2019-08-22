package com.blockbus.wted.core.user.dto.order;

import lombok.Data;

@Data
public class OrderWhere {
    private String id;
    private String orderNo;
    private String userId;
    private Integer orderType;
    private Integer status;
}
