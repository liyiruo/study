package com.线程.多线程核心技术._1.t7;

/**
 * @Classname MyThread
 * @Description isAlive()
 * @Date 2020/10/4 12:52
 * @Created by liyiruo
 */
public class MyThread extends Thread{
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
        System.out.println("run=" + this.isAlive());
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        System.out.println("begin==" + t.isAlive());
        t.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end====" + t.isAlive());
    }
}
