package com.线程.多线程核心技术._2.synLockIn2;

/**
 * @Classname Sub
 * @Description
 * @Date 2020/10/10 01:46
 * @Created by liyiruo
 */
public class Sub extends Main {
    @Override
    public void operateIMainMethod() {

        try {
            while (i>0){
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                super.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
