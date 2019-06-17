package com.company.iteratorPattern.demo;

import java.util.ArrayList;
import java.util.List;


//开发对应的容器类
public class CompanyDevelop implements Company {

    List<Employee> list = new ArrayList<>();

    public CompanyDevelop() {
        list.add(new Employee("小明", 21, "男", "安卓开发"));
        list.add(new Employee("晨晨", 18, "女", "H5"));
        list.add(new Employee("朔风", 19, "男", "JS"));
        list.add(new Employee("糖心", 25, "男", "技术管理"));
    }

    public List<Employee> getEmployees() {
        return list;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new DevelopIterator(list);
    }
}
