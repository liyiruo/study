package com.线程.多线程核心技术._1.t4_threadsafe;

/**
 * @Classname ALogin
 * @Description
 * @Date 2020/10/4 10:59
 * @Created by liyiruo
 */
public class BLogin extends Thread{
    @Override
    public void run() {
        LoginSerlet.doPost("b","bb");
    }
}
