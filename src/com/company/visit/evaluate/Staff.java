package com.company.visit.evaluate;

import java.util.Random;

//员工基类
public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
