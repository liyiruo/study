package com.设计模式._备忘录模式;

/**
 * 备忘录类
 * @author liyiruo
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state='" + state + '\'' +
                '}';
    }
}
