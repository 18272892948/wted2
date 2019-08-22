package com.blockbus.wted.core.user.dto.dictionary;

import lombok.Data;

@Data
public class DictionaryUpdateDto {
    private String id;
    private String code;
    private String name;
    private String value;
    private String columnKey;
    private String columnValue;
    private String content;
    private Integer status;
}
