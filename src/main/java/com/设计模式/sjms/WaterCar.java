package com.设计模式.sjms;

//ConcreteDecorator具体装饰角色
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