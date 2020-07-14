package com.线程.线程通信;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier   cyclicBarrier.await();
 * 创建三个线程，  等三个线程都处于cyclicBarrier.await();时，同时开始执行
 * @author liyiruo
 */
public class ThreeThreadStartDemo {
    //参数是参与cyclicBarrier 的线程数
    private CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

    public void startThread() {
        System.out.println(Thread.currentThread().getName() + "正在准备。。。。。");
        //调用await方法线程全部准备完成
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("线程已经启动完毕。。。" + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        ThreeThreadStartDemo threeThreadStartDemo = new ThreeThreadStartDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threeThreadStartDemo.startThread();
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threeThreadStartDemo.startThread();
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                threeThreadStartDemo.startThread();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
