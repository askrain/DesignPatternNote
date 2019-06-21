package com.company.visit.evaluate;

import java.util.Random;

//工程师
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //    工程师这一年写的代码量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
