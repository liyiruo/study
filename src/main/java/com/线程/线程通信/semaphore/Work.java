package com.线程.线程通信.semaphore;

import java.util.concurrent.Semaphore;

/**
 * 工人轮流拿到机器工作1秒后释放。
 * @author liyiruo
 */
public class Work implements Runnable {
    //工人编号
    private int wordNum;
    //机器数量
    private Semaphore semaphore;

    public Work(int wordNum, Semaphore semaphore) {
        this.wordNum = wordNum;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            //1。工人使用机器
            semaphore.acquire();
            //2.打印工人获取到机器
            System.out.println(Thread.currentThread().getName() + "工人拿到机器");
            //3.线程睡眠
            Thread.sleep(1000);
            //4.使用完毕释放机器
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + "使用完毕，释放机器");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //代表工人数
        int  works = 8;
        //代表机器数
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < works; i++) {
            new Thread(new Work(i,semaphore), String.valueOf(i)).start();
        }

    }
}
