package com.company.decorate.model;


//抽象装饰者
public abstract class Decorator extends Component {
    private Component component;//持有一个Component对象的引用

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
