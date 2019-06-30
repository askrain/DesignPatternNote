package com.company.bridge.coffeeshop;

public class Shop {

    public static void main(String[] args) {
        Ordinary ordinary = new Ordinary();
        Sugar sugar = new Sugar();

        LargeCoffee largeCoffee = new LargeCoffee(ordinary);
        largeCoffee.makeCoffee();

        SmallCoffee smallCoffee = new SmallCoffee(ordinary);
        smallCoffee.makeCoffee();


        LargeCoffee largeCoffee1 = new LargeCoffee(sugar);
        largeCoffee1.makeCoffee();

        SmallCoffee smallCoffee1 = new SmallCoffee(sugar);
        smallCoffee1.makeCoffee();


    }
}
