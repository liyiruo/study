package com.java_base.other;

/**
 * 把类型作为一个参数
 * <T> 先声明一个类型，再使用这个类型
 */
public class ClassType<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
