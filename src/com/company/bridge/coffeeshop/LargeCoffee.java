package com.company.bridge.coffeeshop;

public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + impl + "咖啡");
    }
}
