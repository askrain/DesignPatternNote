package com.company.command.model;


/**
 * 请求者类
 */
public class Invoker {
    private Command command;//持有一个对命令对象的引用

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();//调用具体的命令对象的相关方法，执行具体的命令
    }
}
