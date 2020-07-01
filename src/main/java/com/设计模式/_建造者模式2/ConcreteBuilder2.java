package com.设计模式._建造者模式2;

/**
 * @author liyiruo
 */
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();
    @Override
    public void builderPartA() {
        product.add("部件X");
    }
    @Override
    public void builderPartB() {
        product.add("部件Y");
    }
    @Override
    public Product getResult() {
        return product;
    }
}
