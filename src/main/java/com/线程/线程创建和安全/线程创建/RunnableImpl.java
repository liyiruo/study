package com.线程.线程创建和安全.线程创建;

/**
 * 通过实现接口的方式的创建线程
 * @author liyiruo
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i+" "+System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        //实现线程的类
        RunnableImpl runnable = new RunnableImpl();
        //创建线程 传入2个参数；
        //Thread thread = new Thread(threadIMP,"i am threadName");
        Thread thread = new Thread(runnable,"这是线程名称");
        //启动线程
        thread.start();

    }
}
