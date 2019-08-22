package com.blockbus.wted.common.enums;

public enum OrderTypeEnum {
    TYPE_0(0,"充值"),
    TYPE_1(1,"提现");

    private int code;
    private String name;

    OrderTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(int code){
        for(OrderTypeEnum typeEnum: OrderTypeEnum.values()){
            if(typeEnum.code == code){
                return typeEnum.name;
            }
        }
        return null;
    }


}
