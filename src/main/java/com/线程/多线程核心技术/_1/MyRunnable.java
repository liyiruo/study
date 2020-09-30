package com.线程.多线程核心技术._1;

/**
 * @Classname MyRunnable
 * @Description Runnable 实现线程
 * @Date 2020/9/30 17:47
 * @Created by liyiruo
 */
public class MyRunnable implements Runnable{
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("运行中……");
    }


    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("over");
    }
}
