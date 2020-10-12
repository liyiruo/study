package com.线程.多线程核心技术._4.Fair_noFair_test;

/**
 * @Classname Test_1
 * @Description 公平锁
 * @Date 2020/10/12 22:20
 * @Created by liyiruo
 */
public class Test_1 {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService(true);
        MyThread[] array1 = new MyThread[10];
        MyThread[] array2 = new MyThread[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new MyThread(service);
            array1[i].setName("array1++++" + (i + 1));
        }
        for (int i = 0; i < array1.length; i++) {
            array1[i].start();
        }


        for (int i = 0; i < array2.length; i++) {
            array2[i] = new MyThread(service);
            array2[i].setName("array2----" + (i + 1));
        }
        Thread.sleep(500);
        for (int i = 0; i < array2.length; i++) {
            array2[i].start();
        }

    }

}
