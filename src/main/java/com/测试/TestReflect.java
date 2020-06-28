package com.测试;

/**
 * 反射 得到这个类的方法和字段
 */
public class TestReflect {
    private String name;
    private int age;

    public void doSome(String s){
        System.out.println("this is TestReflect.doSome==》"+s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
