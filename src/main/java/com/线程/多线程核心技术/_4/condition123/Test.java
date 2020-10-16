package com.线程.多线程核心技术._4.condition123;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/17 03:08
 */
public class Test {
    public static void main(String[] args) {
        MyService service = new MyService();
        for (int i = 0; i < 5; i++) {
            ThreadA a = new ThreadA(service);
            a.start();
            ThreadB b = new ThreadB(service);
            b.start();
            ThreadC c = new ThreadC(service);
            c.start();
        }
    }
}
