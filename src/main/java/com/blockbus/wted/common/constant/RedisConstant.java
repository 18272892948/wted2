package com.blockbus.wted.common.constant;

public interface RedisConstant {

    /**
     * 默认超时时间，单位秒
     */
    int DEFAULT_TIME_OUT = 30*60;

    int MOBILE_CODE_TIMEOUT = 5*60;


    /**
     * 短信验证码
     */
    String MOBILE_CODE_REG_PRE = "mobile_reg:";
    String MOBILE_CODE_FORGET_PWD_PRE = "mobile_forget_pwd:";


    String INTRODUCE_CODE_KEY="introduce_code";



    String MANAGER_PRE="mgr:";
    String USER_PRE="usr:";
    String TOKEN_PRE="token:";


    int DEFAULT_LOCK_TIME_OUT = 60*2;
    String REGIST_LOCK= "regist_lock:";
    String FUND_LOCK="fund_lock:";
    String ACCOUNT_LOCK="account_lock:";
    String ORDER_LOCK="order_lock:";
    String ACCOUNT_UPDATE_LOCK="account_update_lock:";
}
