package com.设计模式._命令模式;

/**
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker i = new Invoker();
        i.setCommand(command);
        i.executeCommand();
    }

}
