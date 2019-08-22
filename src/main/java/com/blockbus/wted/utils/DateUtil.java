package com.blockbus.wted.utils;


import com.blockbus.wted.common.constant.DateFormatConstant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {


    public static String getAfterMinuslongStr(int timeout){
        return DateTimeFormatter.ofPattern(DateFormatConstant.Y_M_D_H_M_S).format(LocalDateTime.now().minusMinutes(-timeout));
    }
    public static String getNowlongStr(){
        return DateTimeFormatter.ofPattern(DateFormatConstant.Y_M_D_H_M_S).format(LocalDateTime.now());
    }
    public static String getNowshortStr(){
        return DateTimeFormatter.ofPattern(DateFormatConstant.Y_M_D).format(LocalDate.now());
    }
    public static String getNowNoMarkshortStr(){
        return DateTimeFormatter.ofPattern(DateFormatConstant.YMD).format(LocalDate.now());
    }


    public static int compareLongTimeStr(String time1,String time2){
        LocalDateTime localDateTime1 = (LocalDateTime) DateTimeFormatter.ofPattern(DateFormatConstant.Y_M_D_H_M_S).parse(time1);
        LocalDateTime localDateTime2 = (LocalDateTime) DateTimeFormatter.ofPattern(DateFormatConstant.Y_M_D_H_M_S).parse(time2);
        return localDateTime1.compareTo(localDateTime2);
    }
    public static int compareLongTimeStrToNow(String time1){
        LocalDateTime localDateTime = LocalDateTime.parse(time1,DateTimeFormatter.ofPattern(DateFormatConstant.Y_M_D_H_M_S));
        return localDateTime.compareTo(LocalDateTime.now());
    }

}
