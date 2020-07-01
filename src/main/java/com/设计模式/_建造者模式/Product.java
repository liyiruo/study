package com.设计模式._建造者模式;

/**
 * 产品角色：包含多个组成部件的复杂对象。
 * @author Administrator
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("partA=" + partA + ",partB=" + partB + ",partC=" + partC);
    }
}
