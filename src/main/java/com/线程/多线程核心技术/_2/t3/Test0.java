package com.线程.多线程核心技术._2.t3;

/**
 * @Classname Test0
 * @Description 测试
 * @Date 2020/10/10 00:48
 * @Created by liyiruo
 */
public class Test0 {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(200);//输出结果受到这个值的影响
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
//sleep 6000时
/*
setValue method thread name=Thread-0 username=B password=BB
getValue method thread name=main username=B password=BB
 */

//sleep 200时
/*
getValue method thread name=main username=B password=AA
setValue method thread name=Thread-0 username=B password=BB
 */
