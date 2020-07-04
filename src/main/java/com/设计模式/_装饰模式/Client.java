package com.设计模式._装饰模式;

public class Client {
    public static void main(String[] args) {

        System.out.println("这是一个正常的车================>");
        Car car = new Car();
        car.move();
        System.out.println("--------------------------------");
        System.out.println("增加新的功能：飞行--------------");
        FlyCar flycar = new FlyCar(car);
        flycar.move();

        System.out.println("增加新的功能：水里游---------------");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加两个新的功能，飞行，水里游------------------");
       WaterCar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();

        System.out.println("增加3个新的功能，飞行，水里游------------------");
       WaterCar waterCar3 = new WaterCar(new FlyCar(new AICar(car)));
        waterCar3.move();

    }
}