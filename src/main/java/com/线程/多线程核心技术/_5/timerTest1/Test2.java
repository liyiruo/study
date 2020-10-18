package com.线程.多线程核心技术._5.timerTest1;

import java.util.Date;
import java.util.Timer;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/18 12:28
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        long nowTime = System.currentTimeMillis();
        System.out.println("当前时间为： " + nowTime);

        long scheduleTime = nowTime + 15000;
        System.out.println("计划时间为： " + scheduleTime);

        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, new Date(scheduleTime));

        Thread.sleep(180000);
        timer.cancel();
        Thread.sleep(Integer.MAX_VALUE);
    }
}
