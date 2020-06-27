package com.设计模式._代理模式;

/**主方法
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl schoolGirl=new SchoolGirl();
        schoolGirl.setName("qq");
        Proxys proxys = new Proxys(schoolGirl);
        proxys.giveDolls();
    }

}
