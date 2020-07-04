package com.设计模式._装饰模式;


/**
 * @author liyiruo
 */
public class WaterCar extends SuperCar{

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水里游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}