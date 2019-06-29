package com.company.decorate.dress;


//装饰者具体实现类
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        super.dress();
        dressShirt();
        dressLeather();
        dressJean();
    }

    public void dressShirt() {
        System.out.println("穿件短袖");
    }

    public void dressLeather() {
        System.out.println("穿件皮草");
    }

    public void dressJean() {
        System.out.println("穿牛仔裤");
    }
}
