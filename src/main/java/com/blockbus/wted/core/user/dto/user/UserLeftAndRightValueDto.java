package com.blockbus.wted.core.user.dto.user;

import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class UserLeftAndRightValueDto implements BaseDto {
    private Integer leftValue;
    private Integer rightValue;
}
