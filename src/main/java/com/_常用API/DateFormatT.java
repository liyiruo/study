package com._常用API;

import java.text.DateFormat;
import java.util.Date;

/**
 * 关于日期格式化的API
 * @author liyiruo
 */
public class DateFormatT {

    public static void main(String[] args) {
        //2020年7月4日 上午08时51分07秒
        DateFormat dateFormat1 = DateFormat.getDateTimeInstance(1, 1);
        //2020年7月4日 8:52:02
        DateFormat dateFormat2 = DateFormat.getDateTimeInstance(1, 2);
        //2020-7-4 8:52:30
        DateFormat dateFormat3 = DateFormat.getDateTimeInstance(2, 2);
        //20-7-4 上午8:53
        DateFormat dateFormat4 = DateFormat.getDateTimeInstance(3, 3);
        //参数不能大于3不能小于0
        //DateFormat dateFormat=DateFormat.getDateTimeInstance(4, 4);
        String format1 = dateFormat1.format(new Date());
        String format2 = dateFormat2.format(new Date());
        String format3 = dateFormat3.format(new Date());
        String format4 = dateFormat4.format(new Date());
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
        System.out.println(format4);
    }
}
