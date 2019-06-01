package com.company.factory.factory1;


public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.method();
    }

}
