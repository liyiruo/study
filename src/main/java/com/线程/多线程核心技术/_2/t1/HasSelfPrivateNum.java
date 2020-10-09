package com.线程.多线程核心技术._2.t1;

/**
 * @author liyiruo
 * @Classname HasSelfPrivateNum
 * @Description 主逻辑
 * @Date 2020/10/9 14:15
 * @Created by liyiruo
 */
public class HasSelfPrivateNum {

    public void addI(String username){
        try {
            int num=0;
            if (username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else {
                num=200;
                System.out.println("b set over");
            }
            System.out.println(username + "num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
