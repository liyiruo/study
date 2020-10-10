package com.线程.多线程核心技术._4._309;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Classname Test3
 * @Description unsafe.park(false, 3000000000L);//当前时间等待3000000000纳秒
 * @Date 2020/10/10 11:29
 * @Created by liyiruo
 */
public class Test3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        System.out.println("begin " + System.currentTimeMillis());
        System.currentTimeMillis();
        //3秒的纳秒值是3000000000
        //3秒的微妙值是3000000
        //3秒的毫秒值是3000
        //3秒
        //如果传入false，第2个参数时间单位为纳秒
        unsafe.park(false,3000000000L);
        System.out.println(" end " + System.currentTimeMillis());
    }
}
