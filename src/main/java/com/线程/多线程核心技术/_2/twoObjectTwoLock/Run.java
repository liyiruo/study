package com.线程.多线程核心技术._2.twoObjectTwoLock;

/**
 * @Classname Run
 * @Description 测试方法
 * @Date 2020/10/9 14:48
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) {
        //异步执行 创建了2个对象 2个线程一对一执行 同时各执行个的 异步的。
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(numRef1);
        a.start();
        ThreadB b = new ThreadB(numRef2);
        b.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------");
        //同步执行 2个线程执行一个同步方法  同步
        /*HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        ThreadB threadB = new ThreadB(numRef);
        threadA.start();
        threadB.start();*/
    }
}
