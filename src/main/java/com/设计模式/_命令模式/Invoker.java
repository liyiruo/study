package com.设计模式._命令模式;

/**
 * 请求者
 * @author liyiruo
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
