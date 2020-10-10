package com.线程.多线程核心技术._4._309;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Classname Test5
 * @Description unsafe.park(false, 0L);//永远等待下去
 * @Date 2020/10/10 13:02
 * @Created by liyiruo
 */
public class Test5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field f= Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe= (Unsafe) f.get(null);
        System.out.println("begin " + System.currentTimeMillis());
        System.currentTimeMillis();
        unsafe.park(false,0L);
        System.out.println(" end " + System.currentTimeMillis());
    }
}
