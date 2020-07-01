package com.设计模式._建造者模式;

/**
 * 这个是具体的建造者
 * @author Administrator
 */
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
