package com.线程.多线程核心技术._4.awaitUntilTest;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/17 00:50
 */
public class Run1 {
    public static void main(String[] args) {
        Server server = new Server();
        ThreadA a = new ThreadA(server);
        a.start();
    }
}
