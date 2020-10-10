package com.线程.多线程核心技术._4._309;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Classname Test2
 * @Description pack()的使用方法
 * unsafe.park(true,System.currentTimeMillis()+3000);//当前时间等待3000毫秒
 * @Date 2020/10/10 11:22
 * @Created by liyiruo
 */
public class Test2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe= (Unsafe) f.get(null);
        System.out.println("begin " + System.currentTimeMillis());
        //如果传入的是true，则第二个参数时间单位为毫秒
        unsafe.park(true,System.currentTimeMillis()+3000);
        System.out.println("   end " + System.currentTimeMillis());
    }
}
