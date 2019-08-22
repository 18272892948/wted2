package com.blockbus.wted.config.filter;


import com.blockbus.wted.common.constant.SessionConstant;
import com.blockbus.wted.common.enums.ErrorCodeEnum;
import com.blockbus.wted.config.exception.BusinessException;

import com.blockbus.wted.core.user.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截
 */
public class UserLoginFilter implements HandlerInterceptor {



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        User userEntity = (User) request.getSession().getAttribute(SessionConstant.MEMBER_LOGIN_SESSION_KEY);

        if(userEntity != null){
            return true;
        }
        throw new BusinessException(ErrorCodeEnum.LOGIN_TIMEOUT);
    }
}
