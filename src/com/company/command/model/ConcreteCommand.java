package com.company.command.model;


/**
 * 具体的命令类
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;//持有一个接受者对象的引用

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();//调用接受者的相关方法来执行具体的逻辑
    }
}
