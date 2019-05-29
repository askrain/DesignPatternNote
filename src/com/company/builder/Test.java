package com.company.builder;


//测试代码
public class Test {

    public static void main(String[] args) {
        Builder macBuilder = new MacbookBuilder();
        Director director = new Director(macBuilder);
        director.construct("英特尔主板", "Retina显示器");
        Computer macbook = macBuilder.create();
        System.out.println("Computer info: " + macbook.toString());
    }
}
