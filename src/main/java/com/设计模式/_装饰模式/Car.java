package com.设计模式._装饰模式;

/**
 * 普通的汽车
 * @author liyiruo
 */
public class Car implements ICar {

    @Override
    public void move() {
        System.out.println("陆地上跑！");
    }

}
