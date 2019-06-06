package com.company.State.loginsystem;

//登陆界面 伪代码类
public class LoginActivity {
    public void login() {
//        登陆验证后
        LoginContext.getLoginContext().setState(new LoginState());
        System.out.println("登录成功");

    }
}
