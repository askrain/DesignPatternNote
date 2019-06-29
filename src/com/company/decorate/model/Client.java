package com.company.decorate.model;

public class Client {

    public static void main(String[] args) {


        //构造被装饰的组件对象
        Component component = new ConcreteComponent();

        //根据组件对象构造装饰者对象A并调用，此时相当于给组件对象增加装饰者A的功能方法
        Decorator decoratorA = new ConcreteDecorator(component);
        decoratorA.operate();


        //同理
        Decorator decoratorB = new ConcreteDecorator(component);
        decoratorB.operate();

    }
}
