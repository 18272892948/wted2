package com.blockbus.wted.config.sys;

import com.blockbus.wted.common.constant.PageConstant;
import lombok.Data;

@Data
public class CommonParam {

    private int pageNum = PageConstant.DEFAULT_PAGE_NUM;
    private int pageSize = PageConstant.DEFAULT_PAGE_SIZE;

}
