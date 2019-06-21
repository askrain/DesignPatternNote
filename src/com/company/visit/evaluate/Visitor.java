package com.company.visit.evaluate;


public interface Visitor {
    void visit(Engineer engineer);

    void visit(Manager manager);
}
