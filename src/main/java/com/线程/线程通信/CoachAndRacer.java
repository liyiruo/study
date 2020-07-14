package com.线程.线程通信;

import java.util.concurrent.CountDownLatch;

/**
 * 教练和运动员的线程

 * @author liyiruo
 */
public class CoachAndRacer {
    /**
     * 等待几个线程参数就是几
     * 设置要等待的运动员 为3
     */
    private CountDownLatch countDownLatch = new CountDownLatch(3);

    /**
     * 运动员方法
     */
    public void coach() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "运动员正在准备");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("运动员准备完毕");
        countDownLatch.countDown();
    }

    /**
     * 教练方法
     */
    public void racer() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "等待运动员准备.....");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //所有的运动员准备完毕
        System.out.println("准备完毕，"+name+"开始训练");
    }


    public static void main(String[] args) {

        CoachAndRacer coachAndRacer = new CoachAndRacer();

        //创建3个线程调用运动员方法

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                coachAndRacer.coach();
            }
        },"运动员1");
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                coachAndRacer.coach();
            }
        },"运动员2");
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                coachAndRacer.coach();
            }
        },"运动员3");

        //创建一个线程 调用 教练的方法
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                coachAndRacer.racer();
            }
        },"教练");



        thread1.start();
        thread2.start();
        thread3.start();
        thread.start();
    }
}
