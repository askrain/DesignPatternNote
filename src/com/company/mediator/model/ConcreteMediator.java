package com.company.mediator.model;

public class ConcreteMediator extends Mediator {
    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }
}
