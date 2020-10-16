package com.线程.多线程核心技术._4.awaitUntilTest;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/17 00:51
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Server server = new Server();
        ThreadA a = new ThreadA(server);
        a.start();

        Thread.sleep(2000);

        ThreadB b = new ThreadB(server);
        b.start();
    }
}
