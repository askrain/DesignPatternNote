package com.company.Singleton;

import java.io.ObjectStreamException;

/**
 * 懒汉式
 * 优点：单例在使用的时候才被实例化，在一定程度上节约了资源
 * 缺点：第一次加载时需要就行实例化，反应稍慢。最大的问题时每次调用getInstance（）都会进行同步，造成不必要的同步开销
 */
public class LanSingleton {
    private static LanSingleton singleton;

    private LanSingleton() {

    }

    //    synchronized 关键字表示为同步方法，保证了多线程的情况下，单例对象的唯一性
    public synchronized static LanSingleton getInstance() {
        if (singleton == null) {
            singleton = new LanSingleton();
        }
        return singleton;
    }

    private Object readResolve() throws ObjectStreamException {
        return singleton;
    }

}
