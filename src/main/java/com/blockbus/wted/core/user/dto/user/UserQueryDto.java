package com.blockbus.wted.core.user.dto.user;

import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;


@Data
public class UserQueryDto extends CommonParam implements BaseDto {
    private String id;
    private String userName;
    private Integer grade;
    private String introduceCode;
    private String introduceId;
    private String FirstIntroduceId;
    private Integer leftValue;
    private Integer rightValue;
}
