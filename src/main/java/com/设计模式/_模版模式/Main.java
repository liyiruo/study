package com.设计模式._模版模式;

/**
 * 测试用的主方法
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();
        concreteClass.templateMethod();
        AbstractClass concreteClass2 = new ConcreteClass2();
        concreteClass2.templateMethod();
    }
}
