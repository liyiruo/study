package com.设计模式._桥接模式2;

/**
 * @author liyiruo
 */
public class Display {

    private DisplayImpl displayImpl;

    public Display(DisplayImpl display) {
        this.displayImpl = display;
    }

    public void open() {
        displayImpl.rawOpen();
    }

    public void print() {
        displayImpl.rawPrint();
    }

    public void close() {
        displayImpl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }


}
