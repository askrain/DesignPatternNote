package com.company.decorate.dress;

//抽象的装饰着
public class PersonCloth extends Person {
    private Person person;

    public PersonCloth(Person person) {
        this.person = person;
    }

    @Override
    public void dress() {
        person.dress();
    }
}
