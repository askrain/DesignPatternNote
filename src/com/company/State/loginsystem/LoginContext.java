package com.company.State.loginsystem;

import javax.naming.Context;

/**
 * 用户接口和状态管理类
 */
public class LoginContext {
    static LoginContext loginContext = new LoginContext();
    UserState state = new LogoutState();//用户状态默认为未登陆状态

    private LoginContext() {

    }

    public static LoginContext getLoginContext() {
        return loginContext;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public void forward(Context context) {
        state.forward(context);
    }

    public void comment(Context context) {
        state.comment(context);
    }

}
