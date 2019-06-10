package com.company.iterator.reimbursement;

public class Manager extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("经理批复报销： " + money + "元");
    }
}
