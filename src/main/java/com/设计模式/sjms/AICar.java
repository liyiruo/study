package com.设计模式.sjms;

//ConcreteDecorator具体装饰角色
public class AICar extends SuperCar {

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动跑");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}