package com.线程.多线程核心技术._1.t11;

/**
 * @Classname MyThread
 * @Description  停止线程
 * @Date 2020/10/5 11:15
 * @Created by liyiruo
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500; i++) {
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(0);
        //执行完thread.interrupt(); 线程并没有立即停止
        thread.interrupt();
        System.out.println("zzzzz");
    }
}
