package com.设计模式._建造者模式2;

/**
 * @author liyiruo
 */
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.add("部件A");
    }

    @Override
    public void builderPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
