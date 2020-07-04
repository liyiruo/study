package com.设计模式._备忘录模式;

/**
 * 得到备忘录或者设置备忘录
 * @author liyiruo
 */
public class Caretaker {
 private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
