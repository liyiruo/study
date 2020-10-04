package com.线程.线程创建和安全.共享变量;

/**
 * @Classname ShowVia
 * @Description 共享变量
 * @Date 2020/10/4 10:22
 * @Created by liyiruo
 */
public class ShowVia extends Thread {
    private int count = 5;
    private String a = "a";

    @Override
    /*synchronized 直接放在这里也可以*/ public void run() {
        super.run();
        synchronized (a) {
            if (count > 0) {
                count--;
                System.out.println("由" + Thread.currentThread().getName() + "计算，count=" + count);
            }
        }
    }

    public static void main(String[] args) {
        ShowVia showVia = new ShowVia();
        Thread thread1 = new Thread(showVia, "a");
        Thread thread2 = new Thread(showVia, "b");
        Thread thread3 = new Thread(showVia, "c");
        Thread thread4 = new Thread(showVia, "d");
        Thread thread5 = new Thread(showVia, "e");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
