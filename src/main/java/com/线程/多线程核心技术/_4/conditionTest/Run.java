package com.线程.多线程核心技术._4.conditionTest;

/**
 * @Classname Run
 * @Description 实现生产者和消费值模式 一对一交替输出
 * @Date 2020/10/10 18:28
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) {
        MyService service=new MyService();
        MyThreadA a = new MyThreadA(service);
        MyThreadB b = new MyThreadB(service);
        a.start();
        b.start();
    }
}
