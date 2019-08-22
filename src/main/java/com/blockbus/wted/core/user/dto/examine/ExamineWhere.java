package com.blockbus.wted.core.user.dto.examine;

import lombok.Data;

@Data
public class ExamineWhere {
    private String id;
    private String orderNo;
    private String examineUserId;
    private Integer status;
}
