package com.blockbus.wted.core.user.dto.notice;

import lombok.Data;

@Data
public class NoticeSaveDto {
    private String id;
    private String title;
    private String content;
    private Integer status;
}
