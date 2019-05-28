package com.company.Singleton;


/**
 * 枚举单例
 * 优点：枚举与java的普通类是一样的。不仅能够有字段，也能有自己的方法。最重要的是默认枚举实例的创建的线程安全的，并且在任何情况下都是安全的
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("do something");
    }


}
