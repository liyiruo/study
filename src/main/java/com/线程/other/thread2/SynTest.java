package com.线程.other.thread2;

public class SynTest {
    public static void main(String[] args) {
        new Thread(new CountDown(),"倒计时").start();
    }
}

class CountDown implements Runnable{
    private int time = 10;
    @Override
    public void run() {
        while (true) {
            if (time >= 0) {
                System.out.println(Thread.currentThread().getName() + ":" + time--);
                try {
                    //睡眠时间为1秒
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
    }
}