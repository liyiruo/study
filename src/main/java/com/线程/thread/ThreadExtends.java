package com.线程.thread;

/**
 * 通过继承Thread的方式
 * 重写run方法
 * @author liyiruo
 */
public class ThreadExtends extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(this.getName()+":"+i);
        }
    }
    public static void main(String[] args) {
        ThreadExtends threadExtends = new ThreadExtends();
        threadExtends.start();
    }
}
