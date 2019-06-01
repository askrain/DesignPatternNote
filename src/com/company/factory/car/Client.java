package com.company.factory.car;

public class Client {
    public static void main(String[] args) {
        AudiFactory factory = new AudiCarFactory();
        AudiQ3 q3 = factory.createAudiCar(AudiQ3.class);
        AudiQ5 q5 = factory.createAudiCar(AudiQ5.class);

        q3.drive();
        q3.selfNavigation();


        q5.drive();
        q5.selfNavigation();
    }
}
