package com.company.iteratorPattern.demo;


import java.util.List;

public class DevelopIterator implements Iterator {
    private List<Employee> list;
    private int position;

    public DevelopIterator(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > list.size() - 1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        Employee employee = list.get(position);
        position++;
        return employee;
    }
}
