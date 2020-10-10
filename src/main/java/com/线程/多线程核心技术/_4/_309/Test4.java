package com.线程.多线程核心技术._4._309;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Classname Test4
 * @Description unsafe.park(true, 0L);//不等待，即等待时间为0毫秒
 * @Date 2020/10/10 12:58
 * @Created by liyiruo
 */
public class Test4 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        System.out.println("begin  " + System.currentTimeMillis());
        System.currentTimeMillis();
        unsafe.park(true,0L);
        System.out.println("  end " + System.currentTimeMillis());
    }
}
