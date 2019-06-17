package com.company.iteratorPattern.model;


//客户类
public class Client {
    public static void main(String[] args) {
        Aggregate<String> a = new ConcreteAggregate<>();
        a.add("Aige");
        a.add("Studio\n");
        a.add("SM");
        a.add("brother");

        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
