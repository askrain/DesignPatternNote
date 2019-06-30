package com.company.Facade.mobile;

public class PhoneImpl implements Phone {
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void hangUp() {
        System.out.println("挂断");
    }
}
