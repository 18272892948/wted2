package com.blockbus.wted.core.user.dto.order;

import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class OrderQueryDto extends CommonParam implements BaseDto {
    private String id;
    private String orderNo;
    private String userId;
    private Integer orderType;
    private Integer status;

    private String mobileNo;
    private Integer grade;
}
