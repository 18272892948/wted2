package com.blockbus.wted.core.user.dto.dictionary;

import lombok.Data;

@Data
public class DictionarySaveDto {
    private String code;
    private String name;
    private String value;
    private String columnKey;
    private Integer columnValue;
    private String content;
    private Integer status;
}
