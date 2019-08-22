package com.blockbus.wted.utils;


import com.blockbus.wted.common.constant.PageConstant;
import com.blockbus.wted.config.sys.CommonParam;

public class PageUtil {

    public static<T extends CommonParam> void initPage(T t){
        if(t.getPageNum() == 0){
            t.setPageNum(PageConstant.DEFAULT_PAGE_NUM);
        }
        if(t.getPageSize() == 0){
            t.setPageSize(PageConstant.DEFAULT_PAGE_SIZE);
        }
    }
}
