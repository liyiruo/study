package com.设计模式._装饰模式;
//ConcreteDecorator具体装饰角色
public class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞");
    }
    @Override
    public void move() {
        super.move();
        fly();
    }
}
