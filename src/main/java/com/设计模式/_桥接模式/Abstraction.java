package com.设计模式._桥接模式;

/**
 * @author liyiruo
 */
public abstract class Abstraction {
    private Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public  void operation() {
        implementor.operationImpl();
    }

}
