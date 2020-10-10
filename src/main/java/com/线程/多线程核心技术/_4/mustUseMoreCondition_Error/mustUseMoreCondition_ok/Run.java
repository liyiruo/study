package com.线程.多线程核心技术._4.mustUseMoreCondition_Error.mustUseMoreCondition_ok;

/**
 * @Classname Run
 * @Description TODO
 * @Date 2020/10/10 13:45
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(3000);
//        service.signalAll_A();
        service.signalAll_B();

    }
}
