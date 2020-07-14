package com.线程.thread.线程创建;

/**
 * 通过继承Thread的方式
 * 重写run方法
 * @author liyiruo
 */
public class ThreadExtends extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(this.getName()+":"+i+" "+System.currentTimeMillis());
        }
    }
    public static void main(String[] args) {
        ThreadExtends threadExtends = new ThreadExtends();
        threadExtends.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+Thread.currentThread().getName()+"   "+System.currentTimeMillis());
        }
    }
}
