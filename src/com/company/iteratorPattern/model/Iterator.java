package com.company.iteratorPattern.model;


//迭代器接口
public interface Iterator<T> {
    boolean hasNext();

    T next();//返回当前位置的元素，并将位置移至下一位
}
