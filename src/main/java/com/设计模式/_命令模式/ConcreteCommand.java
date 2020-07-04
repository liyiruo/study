package com.设计模式._命令模式;

/**
 * @author liyiruo
 */
public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
