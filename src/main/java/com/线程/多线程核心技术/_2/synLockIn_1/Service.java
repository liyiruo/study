package com.线程.多线程核心技术._2.synLockIn_1;

/**
 * @Classname Service
 * @Description 可重复锁测试
 * @Date 2020/10/10 01:11
 * @Created by liyiruo
 */
public class Service {
    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized private void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized private void service3() {
        System.out.println("service3");
    }
}
