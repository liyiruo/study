package com.测试;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTime {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
    }
}
