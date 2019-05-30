package com.company.prototype.login;

//登陆session
public class LoginSession {
    static LoginSession loginSession = null;
    private User loginUser;//当前登陆的用户信息

    private LoginSession() {

    }

    public static LoginSession getLoginSession() {
        if (loginSession == null) {
            loginSession = new LoginSession();
        }
        return loginSession;
    }

    public User getLoginUser() {
//        return loginUser;
        return loginUser.clone();
    }

    //    设置已经登陆的用户信息，不对外开放，包级私有
    void setLoginUser(User user) {
        this.loginUser = user;
    }

}
