package com.线程.多线程核心技术._5.timerTest1;

import java.util.TimerTask;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/18 00:38
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行了，时间为=" + System.currentTimeMillis());
    }
}
