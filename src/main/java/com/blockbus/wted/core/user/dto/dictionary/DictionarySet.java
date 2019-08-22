package com.blockbus.wted.core.user.dto.dictionary;

import lombok.Data;

@Data
public class DictionarySet {
    private String name;
    private String value;
    private String columnValue;
    private String content;
    private Integer status;
}
