package com.设计模式._建造者模式;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product construct = director.construct();
        construct.show();
    }
}
