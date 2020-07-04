package com.设计模式._桥接模式2;

/**
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {

        StringDisplayImpl stringDisplay = new StringDisplayImpl("张三");
        Display display = new Display(stringDisplay);
        display.display();


        DisplayImpl displayImpl = new StringDisplayImpl("李四");
        CountDisplay countDisplay = new CountDisplay(displayImpl);
        countDisplay.mutilDisplay();


    }
}
