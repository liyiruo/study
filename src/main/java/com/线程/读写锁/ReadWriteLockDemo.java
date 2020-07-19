package com.线程.读写锁;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 * 写的时候，线程互斥
 * 读的时候，线程不互斥
 *
 * @author liyiruo
 */
public class ReadWriteLockDemo {
    private Map<String, String> map = new HashMap<>();//操作的map对象
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();//读操作锁
    private ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();//写操作锁

    public String get(String key) {
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "读操作已加锁,开始读。。。");
            Thread.sleep(3000);
            return Thread.currentThread().getName() + map.get(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            readLock.unlock();
            System.out.println(Thread.currentThread().getName() + "读操作已解锁,读结束。。。");
        }
    }

    public void put(String key, String value) {
        writeLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "写操作已加锁,开始写。。。");
            Thread.sleep(3000);
            map.put(key, value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
            System.out.println(Thread.currentThread().getName() + "写操作已完成,开始释放锁");
        }

    }

    public static void main(String[] args) {
        ReadWriteLockDemo readWriteLockDemo = new ReadWriteLockDemo();
        readWriteLockDemo.put("key1", "value1");
        for (int i = 0; i < 5; i++) {
            new Thread(() -> System.out.println(readWriteLockDemo.get("key1")), "线程" + i).start();
        }

    }

}
