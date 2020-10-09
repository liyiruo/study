package com.线程.多线程核心技术._2.synLockIn2;

/**
 * @Classname Run
 * @Description 当存在父子继承关系时，子类是完全可以通过锁重入调用父类的同步方法
 * @Date 2020/10/10 01:50
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
