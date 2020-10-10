package com.线程.多线程核心技术._4.conditionTestMoreMethod;

/**
 * @Classname Run
 * @Description 验证多代码块间的同步性
 * @Date 2020/10/10 09:58
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        aa.start();

        Thread.sleep(100);

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        bb.start();
    }
}
