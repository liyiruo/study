package com.线程.thread.threadIMP;

public class ThreadIMP implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        //实现线程的类
        ThreadIMP threadIMP = new ThreadIMP();
        //创建线程 传入2个参数；
        //Thread thread = new Thread(threadIMP,"i am threadName");
        Thread thread = new Thread(threadIMP);
        //启动线程
        thread.start();

    }
}
