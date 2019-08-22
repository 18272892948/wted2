package com.blockbus.wted.utils;

import com.blockbus.wted.common.constant.CommonConstant;
import com.blockbus.wted.common.constant.OrderConstant;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;
import java.util.UUID;

public class HelpUtil {

    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("CF-Connecting-IP");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Forwarded-For");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    public static String randomIntStr(int length){
        StringBuffer buf = new StringBuffer();
        for(int i=0;i<length;i++){
            buf.append((int)(Math.random()*10)+"");
        }
        return buf.toString();
    }

    public static String randomStr(int length){
        String[] str = {"1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h",
                "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H",
                "I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",};
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        while (length>0){
            length--;
            buffer.append(str[random.nextInt(str.length+1)-1]);
        }
        return buffer.toString();
    }



    public static String createOrderNo(){
        return OrderConstant.ORDER_NO_PRE+ DateUtil.getNowNoMarkshortStr()+randomIntStr(OrderConstant.ORDER_NO_SUFFX);
    }

    public static String createId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static String lockValue(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }


    public static String createToken(String id){
        return UUID.randomUUID().toString().replaceAll("-","").concat(CommonConstant.SPLIT_0).concat(id);
    }

}
