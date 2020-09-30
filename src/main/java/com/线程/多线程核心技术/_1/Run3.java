package com.线程.多线程核心技术._1;

/**
 * @Classname Run3
 * @Description 几个基本的技能
 * @Date 2020/9/30 17:14
 * @Created by liyiruo
 */
public class Run3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(){
                /**
                 * If this thread was constructed using a separate
                 * <code>Runnable</code> run object, then that
                 * <code>Runnable</code> object's <code>run</code> method is called;
                 * otherwise, this method does nothing and returns.
                 * <p>
                 * Subclasses of <code>Thread</code> should override this method.
                 *
                 * @see #start()
                 * @see #stop()
                 */
                @Override
                public void run() {
                    try {
                        Thread.sleep(500000);
                        System.out.println("over==>"+Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
