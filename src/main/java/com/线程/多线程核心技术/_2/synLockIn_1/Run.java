package com.线程.多线程核心技术._2.synLockIn_1;

/**
 * @Classname Run
 * @Description 可重入锁 是指自己可以再次获取到自己的内部锁
 * @Date 2020/10/10 01:14
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
