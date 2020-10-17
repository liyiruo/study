package com.线程.多线程核心技术._4.ReadWriteLockBegin1;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/18 00:06
 */
public class Test {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadA b = new ThreadA(service);
        b.start();

    }
}
