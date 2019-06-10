package com.company.iterator.simple;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler2")) {
            System.out.println("ConcreteHandler2 handled!");
        } else {
            successor.handleRequest(condition);
        }
    }
}
