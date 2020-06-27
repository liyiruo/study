package com.设计模式._单例模式;

/**
 * 懒汉模式 线程不安全
 * @author liyiruo
 */
public class Singleton3 {

    private Singleton3() {
    }
    private static Singleton3 INSTANCE;

    public static Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}
