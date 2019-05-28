package com.company.Singleton;

import java.io.ObjectStreamException;

/**
 * CEO  饿汉式单例模式
 */
public class CEO extends Staff {
    private static final CEO ceo = new CEO();

    private CEO() {

    }

    public static CEO getCEO() {
        return ceo;
    }

    @Override
    public void work() {
        //管理VP


    }

    private Object readResolve() throws ObjectStreamException {
        return ceo;
    }

}
