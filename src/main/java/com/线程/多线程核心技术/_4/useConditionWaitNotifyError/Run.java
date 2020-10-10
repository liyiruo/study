package com.线程.多线程核心技术._4.useConditionWaitNotifyError;

/**
 * @Classname Run
 * @Description 测试
 * @Date 2020/10/10 10:21
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
