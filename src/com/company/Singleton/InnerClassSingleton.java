package com.company.Singleton;


import java.io.ObjectStreamException;

/**
 * 静态内部类单例模式 （推荐用法）
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {

    }

    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonHolder.instance;
    }

    private Object readResolve() throws ObjectStreamException {
        return InnerClassSingletonHolder.instance;
    }

    /**
     * 静态内部类
     */
    private static class InnerClassSingletonHolder {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }
}
