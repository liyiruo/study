package com.线程.多线程核心技术._2.t1;

/**
 * @Classname Run
 * @Description 测试方法
 * @Date 2020/10/9 14:48
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(numRef);
        ThreadB b = new ThreadB(numRef);
        a.start();
        b.start();
    }
}
