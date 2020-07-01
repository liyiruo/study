package com.设计模式._建造者模式2;

/**
 * @author liyiruo
 */
public abstract class Builder {

    public abstract void builderPartA();
    public abstract void builderPartB();

    public abstract Product getResult();
}
