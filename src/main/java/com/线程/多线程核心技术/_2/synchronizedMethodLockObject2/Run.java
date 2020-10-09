package com.线程.多线程核心技术._2.synchronizedMethodLockObject2;

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
