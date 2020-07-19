package com.线程.线程创建和安全.线程创建;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现Callable接口
 *
 * @author liyiruo
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程" + Thread.currentThread().getName() +" "+ i+":" + System.currentTimeMillis());
        }
        return "MyCallable 接口执行完成";
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i + " " + System.currentTimeMillis());
        }
        MyCallable myCallable = new MyCallable();
        FutureTask<String> task = new FutureTask<>(myCallable);
        Thread thread = new Thread(task, "Mycallable");
        thread.start();
        try {
            String s = task.get();
            System.out.println("返回的结果是：" + s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
