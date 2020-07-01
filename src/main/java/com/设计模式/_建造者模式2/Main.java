package com.设计模式._建造者模式2;

/**
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Builder b1 = new ConcreteBuilder1();
        director.construct(b1);
        Product result1 = b1.getResult();
        result1.show();


        Builder b2 = new ConcreteBuilder2();
        director.construct(b2);
        Product result2 = b2.getResult();
        result2.show();
    }

}
