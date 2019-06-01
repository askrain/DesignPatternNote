package com.company.factory.factory1;


//具体的工厂类 决定具体的生产对象 可以衍生为多工厂方法 没有个产品的生产都对应一个相应的具体的工厂类
public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
//        return new ConcreteProductB();
    }
}
