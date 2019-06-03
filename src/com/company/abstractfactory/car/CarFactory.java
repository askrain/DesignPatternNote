package com.company.abstractfactory.car;


//抽象车场类
public abstract class CarFactory {
    public abstract ITire createTire();//生产轮胎

    public abstract IEngine createEngine();//生产发动机

    public abstract IBrake createBrake();//生产制动系统
}
