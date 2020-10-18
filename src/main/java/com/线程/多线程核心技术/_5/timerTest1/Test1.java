package com.线程.多线程核心技术._5.timerTest1;

import java.util.Date;
import java.util.Timer;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/10/18 00:39
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        long nowtime=System.currentTimeMillis();
        System.out.println("当前时间为：" + nowtime);
        long scheduleTime=nowtime+10000;
        System.out.println("计划执行时间为：" + scheduleTime);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        Thread.sleep(1000);
        timer.schedule(task,new Date(scheduleTime));
        Thread.sleep(Integer.MAX_VALUE);
    }
}
