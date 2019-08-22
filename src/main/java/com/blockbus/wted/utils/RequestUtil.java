package com.blockbus.wted.utils;


import com.blockbus.wted.common.constant.CommonConstant;
import com.blockbus.wted.common.constant.SessionConstant;

import com.blockbus.wted.core.user.entity.Admin;
import com.blockbus.wted.core.user.entity.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class RequestUtil {
    public static HttpServletRequest getRequest(){
        return ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes())
                .getRequest();
    }

    public static String getManagerdFSession(){
        return ((Admin) RequestUtil.getRequest().getSession().getAttribute(SessionConstant.MEMBER_LOGIN_SESSION_KEY)).getId();
    }
    public static String getUserrIdFSession(){
        return ((User) RequestUtil.getRequest().getSession().getAttribute(SessionConstant.ADMIN_LOGIN_SESSION_KEY)).getId();
    }

    public static String getToken(){
        return getRequest().getHeader(CommonConstant.TOKEN_KEY);
    }

}
