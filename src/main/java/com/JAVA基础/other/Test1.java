package com.JAVA基础.other;


import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author liyiruo
 * @data˜ 2020/3/12  11:04 上午
 */
public class Test1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2020-04-12";
        Long dateCurrent = sdf.parse(date).getTime();
        Long nowCurrent = System.currentTimeMillis();

        System.out.println((dateCurrent - nowCurrent) / 1000 + 24 * 60 * 60 + 1);
        System.out.println((dateCurrent - nowCurrent) / 1000L + 24 * 60 * 60L + 1L);


    }
}
