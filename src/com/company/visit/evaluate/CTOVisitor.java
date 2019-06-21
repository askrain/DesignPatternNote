package com.company.visit.evaluate;

public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师： " + engineer.name + " kpi: " + engineer.kpi + " " +
                "代码行数： " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理： " + manager.name +
                "代码行数： " + manager.getProducts());
    }
}
