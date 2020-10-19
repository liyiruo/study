package com.测试;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author liyiruo
 * @Description  这个类是关于Object类的。
 * @Date 2020/10/19 11:37
 */
public class ObjectMethod {
    @SneakyThrows
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        String s = o.toString();
        boolean equals = o.equals(Object.class);
        int i = o.hashCode();
        o.wait();
        o.notify();
        o.wait(1000L);
        o.wait(10000L,10000);

        Class<?> aClass = o.getClass();
        String name = aClass.getName();
        Field[] declaredFields = aClass.getDeclaredFields();
        Object o1 = aClass.newInstance();
        ClassLoader classLoader = aClass.getClassLoader();
        String simpleName = aClass.getSimpleName();
        Field declaredField = aClass.getDeclaredField("");
        Method method = aClass.getMethod("");
        String typeName = aClass.getTypeName();


        Class<? extends Class> aClass1 = aClass.asSubclass(Class.class);

    }
}
