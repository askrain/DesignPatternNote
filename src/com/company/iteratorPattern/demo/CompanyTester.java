package com.company.iteratorPattern.demo;


public class CompanyTester implements Company {
    private Employee[] array = new Employee[3];

    public CompanyTester() {
        array[0] = new Employee("辉哥", 12, "男", "初级测试");
        array[1] = new Employee("小红", 25, "女", "高级测试");
        array[0] = new Employee("辉总", 35, "男", "测试管理");
    }

    @Override
    public Iterator<Employee> iterator() {
        return new TestIterator(array);
    }

    public Employee[] getEmployees() {
        return array;
    }
}
