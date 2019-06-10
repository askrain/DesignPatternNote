package com.company.iterator.complex;

public class Client {
    public static void main(String[] args) {

//        构造三个处理者对象
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();

//        设置当前处理者对象的下一个节点的处理者对象
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

//        设置三个请求者对象
        AbstractRequest request1 = new Request1("Request1");
        AbstractRequest request2 = new Request2("Request2");
        AbstractRequest request3 = new Request3("Request3");

//        总是从链式的端首发起请求
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}
