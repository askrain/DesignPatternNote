package com.company.composite.model;


//抽象根节点
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }


    /**
     * 具体的逻辑方法由子类实现
     */
    public abstract void doSomething();
}
