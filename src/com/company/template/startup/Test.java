package com.company.template.startup;

public class Test {

    public static void main(String[] args) {

        AbstractComputer coderComputer = new CoderComputer();
        coderComputer.startUp();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        AbstractComputer militaryComputer = new MilitaryComputer();
        militaryComputer.startUp();
    }
}
