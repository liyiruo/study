package com._反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class _Main反射 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        /*
         * 通过反射获取一个类，并获取其实例
         */
        Class clazz = Class.forName("com._反射.TestReflect");
        Object o = clazz.newInstance();
        /*获取其某个方法，需要传入方法名称，和参数类型*/
        Method doSome = clazz.getMethod("doSome", String.class);
        Object invoke = doSome.invoke(o, "张山");


        /*获取其setName方法，为其赋值*/
        Method setName = clazz.getMethod("setName", String.class);
        //这个返回值为空
        Object wangwu = setName.invoke(o, "王五");
        System.out.println("王五===>" + wangwu);

        /*获取其getName方法，获取其值，并输出*/
        Method getName = clazz.getMethod("getName");
        Object o1 = getName.invoke(o);
        System.out.println("o1=====>" + o1);
        /*被反射的类的类名*/
        String name = clazz.getSimpleName();
        System.out.println("name===>" + name);
        /*获取所有的字段*/
        Field[] declaredFields = clazz.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            System.out.println(i + "===>" + declaredFields[i]);
        }

    }
}
