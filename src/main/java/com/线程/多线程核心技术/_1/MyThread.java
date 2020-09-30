package com.线程.多线程核心技术._1;

/**
 * @Classname MyThread
 * @Description 线程随机性的展现
 * @Date 2020/9/30 17:37
 * @Created by liyiruo
 */
public class MyThread extends Thread {
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     */
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("run=" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("myThread");
        thread.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("mian=" + Thread.currentThread().getName());
        }
    }
}
