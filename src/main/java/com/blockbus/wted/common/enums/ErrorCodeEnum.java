package com.blockbus.wted.common.enums;

public enum ErrorCodeEnum {




    FAIL(-1,"系统异常"),
    SUCCESS(0,"SUCCESS"),
    PARAM_ERROR(1,"参数错误"),
    MOBILE_CODE_ERROR(2,"手机验证码错误"),
    REGIST_ERROR(3,"注册失败"),
    USER_REPEAT(4,"用户已经存在"),
    USER_NO_EXIST(5,"用户不存在"),
    NAME_OR_PWD_ERROR(6,"用户名或密码错误"),
    PWD_ERROR(7,"密码错误"),
    LOGIN_TIMEOUT(8,"登录超时，请重新登录"),
    NO_ACCOUNT(9,"未开通资金账户"),
    INVALID_INTRODUCE_USER(10,"无效的邀请用户"),
    MOBILE_CODE_TIMEOUT(11,"手机验证码失效"),
    TASK_REPEAT(14,"定时任务重复执行"),
    TASK_ERROR(15,"定时任务执行错误"),
    MOBILE_CODE_SEND_ERROR(16,"定时任务执行错误"),
    CURRENCY_NO_EXIST(17,"币种未配置"),
    MOBILE_ALREADY_REGIST(18,"该手机号已经注册，请直接登录"),
    MOBILE_NO_EXIST(19,"该手机号不存在"),
    ACCOUNT_NO_ENOUGH_AMOUNT(20,"账户资金不足"),
    NO_SET_FUND(21,"没有配置基金"),
    NO_SET_FUND_CONFIG(22,"没有配置基金"),
    PLS_NOT_REPEAT(23,"请不要重复操作"),
    AMOUNT_ERROR(24,"金额错误"),
    CODE_REPEAT(25,"code值重复"),
    EXCHANGE_NO_EXIST(26,"无当前兑换"),
    CURRENCY_ERROR(27,"币种错误")
    ;



    private int status;
    private String msg;

    ErrorCodeEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
