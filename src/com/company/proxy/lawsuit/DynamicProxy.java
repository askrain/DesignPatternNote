package com.company.proxy.lawsuit;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理类
public class DynamicProxy implements InvocationHandler {
    private Object object;//被代理的类引用

    public DynamicProxy(Object object) {
        this.object = object;
    }

    /**
     * @param proxy  代理类
     * @param method 被代理类的方法
     * @param args   方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理类的方法
        Object result = method.invoke(object, args);
        return result;
    }
}
