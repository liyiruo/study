package com.线程.多线程核心技术._2.t2;

/**
 * @author liyiruo
 * @Classname HasSelfPrivateNum
 * @Description 主逻辑
 * @Date 2020/10/9 14:15
 * @Created by liyiruo
 */
public class HasSelfPrivateNum {

    private int num = 0;

    synchronized public void addI(String username) {
        try {
            // int num=0;todo 把方法内的变量拿到外面，多个线程同时访问一个实例变量，会出现线程安全问题,通过在方法上加synchronized 可以解决。
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + "num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
