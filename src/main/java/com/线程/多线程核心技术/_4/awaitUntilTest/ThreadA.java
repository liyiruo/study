package com.线程.多线程核心技术._4.awaitUntilTest;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/17 00:47
 */
public class ThreadA extends Thread {
    private Server server;

    public ThreadA(Server server) {
        super();
        this.server = server;
    }

    @Override
    public void run() {
        server.waitMethod();
    }
}
