package com.company.State.loginsystem;

import javax.naming.Context;

//已登陆状态
public class LoginState implements UserState {
    @Override
    public void forward(Context context) {
        System.out.println("转发微博");
    }

    @Override
    public void comment(Context context) {
        System.out.println("评论微博");
    }
}
