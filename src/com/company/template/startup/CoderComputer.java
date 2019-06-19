package com.company.template.startup;

public class CoderComputer extends AbstractComputer {
    @Override
    protected void login() {
        System.out.println("程序员 只需要进行用户名和密码验证就可以了");
    }
}
