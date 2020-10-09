package com.线程.多线程核心技术._2.t3;

/**
 * @Classname PublicVar
 * @Description 脏读，发生脏读的原因是在读取实例变量时，此值已经被其他线程修改过了
 * @Date 2020/10/10 00:40
 * @Created by liyiruo
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name="
                    + Thread.currentThread().getName() + " username=" + username + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getValue() {
        System.out.println("getValue method thread name="
                + Thread.currentThread().getName() + " username=" + username + " password=" + password);
    }

}
