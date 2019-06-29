package com.company.decorate.model;


//装饰者具体实现类
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operatorB();
    }


    /**
     * 自定义的装饰方法一
     */
    public void operateA() {
        //装饰方法逻辑
    }

    /**
     * 自定义的装饰方法二
     */
    public void operatorB() {
        //装饰方法逻辑

    }
}
