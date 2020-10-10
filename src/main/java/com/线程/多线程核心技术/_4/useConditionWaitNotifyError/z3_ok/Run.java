package com.线程.多线程核心技术._4.useConditionWaitNotifyError.z3_ok;

/**
 * @Classname R
 * @Description TODO
 * @Date 2020/10/10 10:28
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA a1 = new MyThreadA(service);
        a1.start();
        MyThreadA a2 = new MyThreadA(service);
        a2.start();
        MyThreadA a3 = new MyThreadA(service);
        a3.start();
    }
}
