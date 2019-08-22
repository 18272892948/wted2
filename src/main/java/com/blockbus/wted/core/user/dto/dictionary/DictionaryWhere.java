package com.blockbus.wted.core.user.dto.dictionary;

import lombok.Data;

@Data
public class DictionaryWhere {
    private String id;
    private String code;
    private String name;
    private String columnKey;
    private Integer status;
}
