package com.线程.多线程核心技术._4.lockMethodTest3.test2;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/15 23:53
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = () -> {
            service.serviceMethod();
        };

        Thread a = new Thread(runnable);
        a.setName("a");
        a.start();
    }
}

