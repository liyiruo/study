package com.设计模式._模版模式;

/**
 * 实现抽象类中的方法
 * @author liyiruo
 */
public class ConcreteClass extends AbstractClass {
    @Override
    void operation1() {

        System.out.println("ConcreteClass 中的方法1");
    }

    @Override
    void operation2() {
        System.out.println("ConcreteClass 中的方法2");
    }

}
