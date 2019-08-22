package com.blockbus.wted.core.user.dto.dictionary;

import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class DictionaryQueryDto extends CommonParam implements BaseDto {
    private String id;
    private String code;
    private String name;
    private String columnKey;
    private Integer status;
}
