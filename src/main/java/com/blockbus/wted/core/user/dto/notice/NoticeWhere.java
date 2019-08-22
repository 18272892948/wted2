package com.blockbus.wted.core.user.dto.notice;

import lombok.Data;


@Data
public class NoticeWhere {
    private String id;
    private String title;
    private String create_manager_id;
    private String update_manager_id;
    private Integer status;
}
