package com.company.factory.factory1;


//抽象工厂类
public abstract class Factory {
    /**
     * 抽象工厂方法，生产什么产品 由子类决定
     *
     * @return 具体的产品
     */
    public abstract Product createProduct();
}
