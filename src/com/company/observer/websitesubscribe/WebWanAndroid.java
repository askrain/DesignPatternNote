package com.company.observer.websitesubscribe;

import java.util.Observable;

/**
 * 即玩安卓网站，被观察者角色，当它更新的时候，所有的程序员（观察者）会接到相应的通知
 */
public class WebWanAndroid extends Observable {
    public void postNewPublication(String content) {
        setChanged();//状态标识或者内容发生变化
        notifyObservers(content);//通知所有观察者
    }

}
