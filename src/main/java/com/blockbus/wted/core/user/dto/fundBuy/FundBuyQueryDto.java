package com.blockbus.wted.core.user.dto.fundBuy;


import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

import java.util.List;

@Data
public class FundBuyQueryDto extends CommonParam implements BaseDto {
    private String id;
    private String code;
    private String name;
    private String userId;
    private Integer grade;
    private String buyCurrency;
    private String rewardCurrency;
    private Integer status;

    private List<String> userIdList;
    private String mobileNo;
    private String startTimeStr;
    private String endTimeStr;
}
