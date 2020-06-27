package com.设计模式._单例模式;

/**
 * 设计模式之懒汉模式 双重验证
 * 线程安全版
 * @author liyiruo
 */
public class Singleton4 {
    private Singleton4() {}
    private static volatile Singleton4 INSTANCE;

    public static Singleton4 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton4.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton4();
                }
            }
        }
        return INSTANCE;
    }
}
