package com.blockbus.wted.core.user.dto.manager;

import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class ManagerQueryDto implements BaseDto {
    private String id;
    private String userName;
    private String pwd;
    private Integer status;
}
