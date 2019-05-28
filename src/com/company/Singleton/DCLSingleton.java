package com.company.Singleton;

import java.io.ObjectStreamException;

/**
 * Double Check Lock单例
 * 优点：资源利用率高 第一次执行getInstance()的时候才会被实例化，效率高
 * 缺点：第一次加载较慢 由于java内存模型的原因偶尔会失败 高并发环境有小概率缺陷
 * 是使用最多的单例模式
 */
public class DCLSingleton {
    private static volatile DCLSingleton singleton = null;//volatile 针对singleton = new DCLSingleton() 关键字保证singleton对象每次都从主内存中读取

    private DCLSingleton() {

    }

    public static DCLSingleton getInstance() {
        if (singleton == null) { //避免不必要的同步
            synchronized (DCLSingleton.class) {
                if (singleton == null) {//在null的情况下，创建实例，保证这个操作是原子操作
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }

    private Object readResolve() throws ObjectStreamException {
        return singleton;
    }

}
