package com.设计模式._建造者模式2;

/**
 * @author liyiruo
 */
public class Director {
    public void construct(Builder builder) {
        builder.builderPartA();
        builder.builderPartB();
    }
}
