package com.设计模式._建造者模式;

public class ConcreteBuilder extends Builder {
    @Override
    void buildPartA() {
        product.setPartA("buildPartA");
    }

    @Override
    void buildPartB() {
        product.setPartB("buildPartB");
    }

    @Override
    void buildPartC() {
product.setPartC("buildPartC");
    }
}
