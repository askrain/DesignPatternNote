package com.company.prototype.login;


//登陆测试类
public class Test {
    public static void main(String[] args) {
//        User curUser = LoginSession.getLoginSession().getLoginUser();
        User curUser = new User();
//        将服务器返回的信息设置给loginUser
        curUser.age = 22;
        curUser.name = "Night";
        curUser.phoneNum = "12685699865";
        curUser.address = new Address("南阳", "西峡", "二郎坪");
        System.out.println("用户原始的信息：");
        System.out.println(curUser);

        curUser.address = new Address("南京", "建邺", "油坊桥");
        System.out.println("用户现在的信息：");
        System.out.println(curUser);


    }

}
