package com.线程.多线程核心技术._1.t4_threadsafe;

/**
 * @Classname Run
 * @Description
 * @Date 2020/10/4 11:01
 * @Created by liyiruo
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
