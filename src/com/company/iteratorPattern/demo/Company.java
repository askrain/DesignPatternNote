package com.company.iteratorPattern.demo;

//容器类接口，主要是定义一个可以返回容器迭代器的方法
public interface Company {
    Iterator<Employee> iterator();
}
