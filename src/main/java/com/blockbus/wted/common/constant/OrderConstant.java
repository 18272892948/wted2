package com.blockbus.wted.common.constant;

public interface OrderConstant {

    String ORDER_NO_PRE = "NO_";
    int ORDER_NO_SUFFX= 10;

    /**
     * 0完成，1待完成，2待审核，3审核中，4审核完成
     */
    int ORDER_STATUS_0=0;
    int ORDER_STATUS_1=1;
    int ORDER_STATUS_2=2;
    int ORDER_STATUS_3=3;
    int ORDER_STATUS_4=4;

    /**
     * 0 充值
     * 1 提现
     */
    int ORDER_TYPE_0 = 0;
    int ORDER_TYPE_1 = 1;
}
