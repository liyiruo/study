package com.设计模式._桥接模式2;

/**
 * @author liyiruo
 */
public class StringDisplayImpl implements DisplayImpl {


  private   String name;

    public StringDisplayImpl(String name) {
        this.name = name;
    }

    @Override
    public void rawOpen() {
        printline();
    }

    @Override
    public void rawPrint() {
        System.out.println("this is name" + name);
    }

    @Override
    public void rawClose() {
        printline();
    }

    public void printline() {
        System.out.println("==========");
    }
}
