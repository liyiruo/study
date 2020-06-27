package com.设计模式.single;

/**
 * 设计模式单例模式 饿汉模式 线程安全
 * @author liyiruo
 */
public class Singleton1 {
    private static Singleton1 INSTANCE = new Singleton1();
    private  Singleton1() {
    }
    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
