package com.线程.多线程核心技术._4.awaitTest_method1;

/**
 * @author liyiruo
 * @Description 线程休眠后自动唤醒
 * @Date 2020/10/16 02:33
 */
public class Test {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }

}
