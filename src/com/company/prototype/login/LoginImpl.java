package com.company.prototype.login;

public class LoginImpl implements Login {
    @Override
    public void login() {
//        登陆到服务器，获取用户信息
        User user = new User();
//        将服务器返回的信息设置给loginUser
        user.age = 22;
        user.name = "Night";
        user.phoneNum = "12685699865";
        user.address = new Address("南阳", "西峡", "二郎坪");

//        登陆完成之后将用户信息设置懂啊LoginSession中
        LoginSession loginSession = LoginSession.getLoginSession();
        loginSession.setLoginUser(user);//因为setLoginSession（）为包级私有，外部module无法调用

    }
}
