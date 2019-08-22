package com.blockbus.wted.utils;

import org.springframework.beans.BeanUtils;

public class BeanUtil {
    public static <R,T> T copy(R r,T t){
        BeanUtils.copyProperties(r,t);
        return t;
    }
}
