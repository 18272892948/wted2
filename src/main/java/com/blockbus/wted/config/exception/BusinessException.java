package com.blockbus.wted.config.exception;

import com.blockbus.wted.common.enums.ErrorCodeEnum;
import lombok.Data;

@Data
public class BusinessException extends Exception{
    private int status;
    private String msg;

    public BusinessException() {
    }

    public BusinessException(Throwable throwable) {
    }

    public BusinessException(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
    public BusinessException(String msg) {
        this.status = ErrorCodeEnum.FAIL.getStatus();
        this.msg = msg;
    }

    public BusinessException(ErrorCodeEnum errorCodeEnum) {
        this.status = errorCodeEnum.getStatus();
        this.msg = errorCodeEnum.getMsg();
    }

}
