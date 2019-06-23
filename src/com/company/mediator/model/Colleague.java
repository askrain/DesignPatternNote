package com.company.mediator.model;


//抽象同事
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 同事角色的具体行为，由子类实现
     */
    public abstract void action();
}
