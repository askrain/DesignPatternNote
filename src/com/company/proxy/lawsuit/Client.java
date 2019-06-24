package com.company.proxy.lawsuit;

public class Client {
    public static void main(String[] args) {
        ILawsuit xiaomin = new XiaoMin();//构造被代理类
        Lawyer lawyer = new Lawyer(xiaomin);//构造一个代理律师并将小民作为构造参数传入
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();

    }
}
