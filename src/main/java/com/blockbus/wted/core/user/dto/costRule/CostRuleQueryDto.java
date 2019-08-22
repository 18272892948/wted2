package com.blockbus.wted.core.user.dto.costRule;

import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class CostRuleQueryDto extends CommonParam implements BaseDto {
    private String id;
    private String code;
    private String name;
    private Integer type;
    private Integer status;
}
