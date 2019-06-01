package com.company.factory.factory2;


public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        ConcreteProductA productA =
                factory.createProduct(ConcreteProductA.class);
        ConcreteProductB productB =
                factory.createProduct(ConcreteProductB.class);

        productA.method();
        productB.method();
    }

}
