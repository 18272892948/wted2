package com.blockbus.wted.config.filter;

import com.blockbus.wted.common.enums.ErrorCodeEnum;
import com.blockbus.wted.config.exception.BusinessException;
import com.blockbus.wted.config.sys.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常拦截
 */
@RestControllerAdvice
public class ControllerExceptionFilter {

    private Logger logger = LoggerFactory.getLogger(ControllerExceptionFilter.class);

    @ExceptionHandler(Exception.class)
    public Result exHander(Exception ex){
        logger.error("Exception : "+ex);
        return Result.error(ErrorCodeEnum.FAIL);
    }

    @ExceptionHandler(Throwable.class)
    public Result exHander(Throwable th){
        logger.error("Throwable : "+th);
        return Result.error(ErrorCodeEnum.FAIL);
    }

    @ExceptionHandler(BusinessException.class)
    public Result exHander(BusinessException ex){
        logger.error(ex.getMsg());
        return Result.error(ex);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){

    }
}
