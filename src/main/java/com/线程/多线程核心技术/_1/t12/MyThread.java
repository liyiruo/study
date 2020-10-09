package com.线程.多线程核心技术._1.t12;

/**
 * @Classname MyThread
 * @Description 线程状态
 * @Date 2020/10/5 11:15
 * @Created by liyiruo
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500; i++) {
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(0);
            //执行完thread.interrupt(); 线程并没有立即停止
            thread.interrupt();
            System.out.println("zzzzz");

            System.out.println("是否停止 1？" + interrupted());
            System.out.println("是否停止 2？" + interrupted());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.currentThread().interrupt();
        System.out.println("是否停止 3？" + Thread.interrupted());
        System.out.println("是否停止 4？" + Thread.interrupted());
        System.out.println("end");
    }
}
