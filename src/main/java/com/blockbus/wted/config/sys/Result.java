package com.blockbus.wted.config.sys;


import com.blockbus.wted.common.enums.ErrorCodeEnum;
import com.blockbus.wted.config.exception.BusinessException;
import lombok.Data;

@Data
public class Result {



    private int status;
    private String msg;

    private Object data;


    private Result() {
    }

    public static Result getInstance(){
        return new Result();
    }

    public static Result ok(int code, String msg, Object data){
        Result result = Result.getInstance();
        result.status = code;
        result.msg = msg;
        result.data=data;
        return result;
    }

    public static Result ok(int code, String msg){
        Result result = Result.getInstance();
        result.status = code;
        result.msg = msg;
        return result;
    }

    public static Result ok(Object data){
        Result result = Result.getInstance();
        result.status = ErrorCodeEnum.SUCCESS.getStatus();
        result.msg = ErrorCodeEnum.SUCCESS.getMsg();
        result.data = data;
        return result;
    }
    public static Result ok(){
        Result result = Result.getInstance();
        result.status = ErrorCodeEnum.SUCCESS.getStatus();
        result.msg = ErrorCodeEnum.SUCCESS.getMsg();
        return result;
    }


    public static Result error(int status, String msg){
        Result result = Result.getInstance();
        result.status = status;
        result.msg = msg;
        return result;
    }

    public static Result error(BusinessException ex){
        Result result = Result.getInstance();
       result.status = ex.getStatus();
        result.msg = ex.getMsg();
        return result;
    }
    public static Result error(ErrorCodeEnum errorCodeEnum){
        Result result = Result.getInstance();
        result.status = errorCodeEnum.getStatus();
        result.msg = errorCodeEnum.getMsg();
        return result;
    }


}
