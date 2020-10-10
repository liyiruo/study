package com.线程.多线程核心技术._4.conditionTestManyToMany;

/**
 * @Classname Run
 * @Description 实现生产者和消费值模式 多对多交替输出
 * @Date 2020/10/10 18:28
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA[] a = new MyThreadA[10];
        MyThreadB[] b = new MyThreadB[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new MyThreadA(service);
            b[i] = new MyThreadB(service);
            a[i].start();
            b[i].start();
        }
    }
}
