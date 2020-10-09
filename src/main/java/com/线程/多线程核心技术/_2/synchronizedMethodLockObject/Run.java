package com.线程.多线程核心技术._2.synchronizedMethodLockObject;

/**
 * @Classname Run
 * @Description 两个线程同时执行同一个类的实例，属于异步执行
 * 但是在myObject 上加上synchronized 就可以保证 同步执行了。
 * @Date 2020/10/10 00:07
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA a = new ThreadA(myObject);
        a.setName("A");
        ThreadB b = new ThreadB(myObject);
        b.setName("B");

        a.start();
        b.start();

    }
}
