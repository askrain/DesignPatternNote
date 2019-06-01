package com.company.factory.car;

public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
