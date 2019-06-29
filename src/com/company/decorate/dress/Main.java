package com.company.decorate.dress;

public class Main {
    public static void main(String[] args) {

        Person person = new Boy();

        PersonCloth clothCheap = new CheapCloth(person);
        clothCheap.dress();

        PersonCloth clothExpensive = new ExpensiveCloth(person);
        clothExpensive.dress();
    }
}
