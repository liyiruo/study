package com.线程.多线程核心技术._4.lockMethodTest3.test3;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/16 00:23
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = () -> {
            service.serviceMethod();
        };
        Thread a = new Thread(runnable);
        a.start();
    }
}
