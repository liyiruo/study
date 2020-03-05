package com.线程.thread.threadEXT;

/**
 * 通过继承Thread的方式
 * 重写run方法
 */
public class MyThreadEXT extends Thread{
    @Override
    public void run() {
        //super.run();
        for (int i = 0; i <100 ; i++) {
            System.out.println(this.getName()+":"+i);
        }
    }
    public static void main(String[] args) {
        MyThreadEXT myThreadEXT = new MyThreadEXT();
        myThreadEXT.start();
    }
}
