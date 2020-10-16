package com.线程.多线程核心技术._4.awaitUninterruptiblyTest_1;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/17 02:43
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();
        MyThread a = new MyThread(service);
        a.start();
        Thread.sleep(3000);
        a.interrupt();
    }
}
