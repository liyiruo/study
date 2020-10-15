package com.线程.多线程核心技术._4.lockMethodTest3.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/15 23:47
 */
public class Run {
    public static void main(String[] args) {
        ReentrantLock lock1=new ReentrantLock(true);
        System.out.println(lock1.isFair());

        ReentrantLock lock2=new ReentrantLock(false);
        System.out.println(lock2.isFair());

        ReentrantLock lock3=new ReentrantLock();
        System.out.println(lock3.isFair());

    }
}
