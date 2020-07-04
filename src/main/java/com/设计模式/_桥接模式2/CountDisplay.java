package com.设计模式._桥接模式2;

/**
 * @author liyiruo
 */
public class CountDisplay extends Display {
    CountDisplay(DisplayImpl display) {
        super(display);
    }


    final void mutilDisplay() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
