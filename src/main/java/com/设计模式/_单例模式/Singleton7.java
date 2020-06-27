package com.设计模式._单例模式;

/**设计模式 单例模式 静态内部类 懒加载
 * @author liyiruo
 */
public class Singleton7 {
    private Singleton7() {
    }
    private static class Singleton7Holder {
        private final static Singleton7 INSTANCE = new Singleton7();
    }
    public Singleton7 getInstance() {
        return Singleton7Holder.INSTANCE;
    }
}
