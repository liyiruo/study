package com.JAVA基础.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化
 */
public class DateFormatTest {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sf.parse("2020-03-01");
        long time = date.getTime();
        System.out.println(time/1000);
    }

}
