package com.线程.多线程核心技术._2.synLockIn2;

/**
 * @Classname Main
 * @Description 锁重入支持继承的环境
 * @Date 2020/10/10 01:44
 * @Created by liyiruo
 */
public class Main {
    public int i=10;

    public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
