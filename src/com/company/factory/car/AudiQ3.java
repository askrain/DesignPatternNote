package com.company.factory.car;

public class AudiQ3 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q3启动了！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q3开始自动巡航！");
    }
}
