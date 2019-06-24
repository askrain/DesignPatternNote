package com.company.proxy.lawsuit;


import java.lang.reflect.Proxy;

public class Client2 {
    public static void main(String[] args) {
        ILawsuit xiaomin = new XiaoMin();//构造被代理者
        DynamicProxy proxy = new DynamicProxy(xiaomin);//构造一个动态代理

        //获取被代理类小民的ClassLoader
        ClassLoader classLoader = xiaomin.getClass().getClassLoader();

        //动态构造一个代理者律师
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(classLoader,
                new Class[]{ILawsuit.class}, proxy);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }

}
