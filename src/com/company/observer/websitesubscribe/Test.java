package com.company.observer.websitesubscribe;

public class Test {

    public static void main(String[] args) {

//        被观察者
        WebWanAndroid web = new WebWanAndroid();

//        观察者
        Coder mrsimple = new Coder("mr.simple");
        Coder coder1 = new Coder("coder1");
        Coder coder2 = new Coder("coder2");
        Coder coder3 = new Coder("coder3");

//        将观察者注册到可观察对象的观察者列表中

        web.addObserver(mrsimple);
        web.addObserver(coder1);
        web.addObserver(coder2);
        web.addObserver(coder3);

        web.postNewPublication("安卓需求升温！安卓技术需求高的现状一直在持续！");
    }
}
