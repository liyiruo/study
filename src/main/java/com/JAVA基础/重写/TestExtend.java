package com.JAVA基础.重写;

/**
 * @author liyiruo
 */
public class TestExtend {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
        //todo 编译报错 因为：当使用子类来代替创建父类的实现类时，
        // 只能调用父类中的方法或重写后的父类中的方法
        // b.bark();
    }
}

class Animal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("dog can move");
    }

    public void bark() {
    }
}