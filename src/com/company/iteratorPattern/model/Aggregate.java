package com.company.iteratorPattern.model;


//容器接口
public interface Aggregate<T> {

    void add(T obj);

    void remove(T obj);

    Iterator<T> iterator();//获取迭代器对象
}
