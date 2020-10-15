package com.线程.多线程核心技术._4.tryLock_param;

/**
 * @author liyiruo
 * @Description 如果当前线程发现锁被其他线程持有了，则返回false，程序继续执行后面的代码，而不是呈阻塞等待的状态。
 * 如果当前线程线程在指定的时间持有了锁，则返回值是true，超过时间则返回false。参数timeout代表当前线程抢锁的时间。
 * @Date 2020/10/16 02:01
 */
public class Run {
    public static void main(String[] args) {
        final MyService service = new MyService();
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "调用waitMethod时间：" + System.currentTimeMillis());
            service.waitMethod();
        };


        Thread a = new Thread(runnable);
        a.setName("A");
        a.start();
        try {
            Thread.sleep(7000);//todo 这个等待时间， 与 @linked {MyService} 的时间有很重要的相关性
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread b = new Thread(runnable);
        b.setName("B");
        b.start();
    }
}
