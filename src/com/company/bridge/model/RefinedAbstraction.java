package com.company.bridge.model;

//抽象部分的子类
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refinedOperation() {
        //对Abstraction中的方法进行扩展
    }
}
