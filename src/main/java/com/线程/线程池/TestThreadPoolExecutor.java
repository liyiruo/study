package com.线程.线程池;

import java.util.concurrent.*;

/**
 * 参数最全的线程池
 * @author liyiruo
 */
public class TestThreadPoolExecutor {
    public static void main(String[] args) {
        int corePoolSize=30;//核心线程数
        int maximumPoolSize=100;//最大线程数
        long keepAliveTime=60L;//空闲线程存活时间 （空闲线程是指 核心线程之外的线程）
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> workQueue =new SynchronousQueue();//
        BlockingQueue<Runnable> workQueue1 =new LinkedBlockingDeque<>();//
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r);
            }
        };//指定创建线程的工厂
        RejectedExecutionHandler handle = new  ThreadPoolExecutor.DiscardPolicy();//抛弃当前线程，
        RejectedExecutionHandler handle1 = new  ThreadPoolExecutor.AbortPolicy();//抛出RejectedExecutorException异常
        RejectedExecutionHandler handle2 = new  ThreadPoolExecutor.CallerRunsPolicy();//由向线程池提交任务的线程来执行该任务
        RejectedExecutionHandler handle3 = new  ThreadPoolExecutor.DiscardOldestPolicy();//抛弃最旧线程

        //这个是最齐全的线程池的构造参数
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                unit,
                workQueue,
                threadFactory,
                handle);
        executor.execute(()->{
            System.out.println("这是一个线程池");
        });
    }


}
