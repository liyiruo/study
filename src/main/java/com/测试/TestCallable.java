package com.测试;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author liyiruo
 */
public class TestCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("do something");
        return "return something";
    }

    public static void main(String[] args) {
        Callable<String> callable = new TestCallable();
        FutureTask<String> task=new FutureTask<String>(callable);
        Thread thread=new Thread(task);
        thread.start();
        try {
            String s = task.get();
            System.out.println(s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
