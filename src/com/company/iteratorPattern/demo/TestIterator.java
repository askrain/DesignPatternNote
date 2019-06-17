package com.company.iteratorPattern.demo;

public class TestIterator implements Iterator {

    private Employee[] array;
    private int position;

    public TestIterator(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position > array.length || array[position] == null);
    }

    @Override
    public Object next() {
        Employee employee = array[position];
        position++;
        return employee;
    }
}
