package com.company.iteratorPattern.demo;

public class Boss {
    public static void main(String[] args) {
        CompanyDevelop develop = new CompanyDevelop();
        check(develop.iterator());

        CompanyTester tester = new CompanyTester();
        check(tester.iterator());

    }


    private static void check(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
