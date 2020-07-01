package com.设计模式._建造者模式;

/**
 * 建造者抽象类，包含具体的抽象方法
 * 返回一个产品
 * @author Administrator
 */
public abstract class Builder {

    public Product product=new Product();

    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();

    public Product getProduct() {
        return this.product;
    }

}
