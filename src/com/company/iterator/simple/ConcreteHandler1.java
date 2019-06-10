package com.company.iterator.simple;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler1")) {
            System.out.println("ConcreteHandler1 handled!");
        } else {
            successor.handleRequest(condition);
        }
    }
}
