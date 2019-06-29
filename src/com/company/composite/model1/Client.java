package com.company.composite.model1;

//客户类
public class Client {

    public static void main(String[] args) {
        //构造一个根节点
        Composite root = new Composite("root");

        //构造两个枝干节点
        Composite branch1 = new Composite("branch1");
        Composite branch2 = new Composite("branch2");

        //构造两个叶子节点

        Composite leaf1 = new Composite("leaf1");
        Composite leaf2 = new Composite("leaf2");

        //将叶子节点添加到枝干节点中
        branch1.addChild(leaf1);
        branch2.addChild(leaf2);

        //将枝干节点添加到根节点中
        root.addChild(branch1);
        root.addChild(branch2);
        root.doSomething();
    }
}
