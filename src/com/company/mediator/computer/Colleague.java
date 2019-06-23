package com.company.mediator.computer;


//抽象同事
public abstract class Colleague {
    protected Mediator mediator;//每一个同事都应该知道它的中介者

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
