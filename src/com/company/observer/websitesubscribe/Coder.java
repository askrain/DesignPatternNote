package com.company.observer.websitesubscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * 程序员时观察者
 */
public class Coder implements Observer {
    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi, " + name + ", WanAndroid更新了，内容： " + arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
