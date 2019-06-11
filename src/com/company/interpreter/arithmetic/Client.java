package com.company.interpreter.arithmetic;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("153 + 3589 + 118 + 555");
        System.out.println(calculator.calculate());

        Calculator calculator1 = new Calculator("10 - 2 - 3");
        System.out.println(calculator1.calculate());
    }
}
