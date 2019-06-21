package com.company.visit.evaluate;

public class Client {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("======给CEO看的报表======");
        report.showReport(new CEOVisitor());

        System.out.println("======给CTO看的报表======");
        report.showReport(new CTOVisitor());
    }
}
