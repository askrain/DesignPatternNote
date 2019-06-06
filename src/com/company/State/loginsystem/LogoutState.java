package com.company.State.loginsystem;

import javax.naming.Context;

//注销状态，即未登陆的状态
public class LogoutState implements UserState {
    @Override
    public void forward(Context context) {//没有登陆状态不能转发，跳转注册页面
        goToLoginActivity(context);
    }

    @Override
    public void comment(Context context) {//没有登陆状态不能评论，跳转注册页面
        goToLoginActivity(context);
    }

    private void goToLoginActivity(Context context) {
        /*Intent intent =new Intent(context,goToLoginActivity().class);
        context.startActivity(intent);*/
    }

}
