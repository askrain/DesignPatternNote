package com.company.visit.evaluate;

import java.util.Random;

public class Manager extends Staff {
    private int products;

    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);//产品数量
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return products;
    }
}
