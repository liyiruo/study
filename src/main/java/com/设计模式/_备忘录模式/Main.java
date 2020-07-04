package com.设计模式._备忘录模式;

/**
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {
        //初始状态，设置为on
        Originator o = new Originator();
        o.setState("on");
        o.show();
        //将此状态保存
        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());
        //将状态修改
        o.setState("off");
        o.show();
        //将状态恢复
        o.setMemento(c.getMemento());
        o.show();
    }
}
