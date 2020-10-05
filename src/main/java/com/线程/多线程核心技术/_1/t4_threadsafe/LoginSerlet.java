package com.线程.多线程核心技术._1.t4_threadsafe;

/**
 * @Classname LoginSerlet
 * @Description 模拟一个Serlet
 * @Date 2020/10/4 10:52
 * @Created by liyiruo
 */
public class LoginSerlet {
    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            /**
             * 当是a的时候休眠了。
             */
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username= " + usernameRef + "    password=" + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
