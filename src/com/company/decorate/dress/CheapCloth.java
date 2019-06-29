package com.company.decorate.dress;


//装饰者具体实现类
public class CheapCloth extends PersonCloth {
    public CheapCloth(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        super.dress();
        dressShorts();

    }

    public void dressShorts() {
        System.out.println("穿件短裤");
    }

}
