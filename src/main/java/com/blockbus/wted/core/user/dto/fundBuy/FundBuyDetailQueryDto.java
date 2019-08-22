package com.blockbus.wted.core.user.dto.fundBuy;

import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class FundBuyDetailQueryDto extends CommonParam implements BaseDto {
    private String fundBuyId;
}
