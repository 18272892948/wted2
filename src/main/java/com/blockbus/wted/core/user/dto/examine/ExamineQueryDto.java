package com.blockbus.wted.core.user.dto.examine;

import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class ExamineQueryDto extends CommonParam implements BaseDto {
    private String id;
    private String orderNo;
    private String examineUserId;
    private Integer status;
}
