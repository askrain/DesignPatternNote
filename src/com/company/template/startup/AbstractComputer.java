package com.company.template.startup;

//抽象的computer
public abstract class AbstractComputer {

    protected void powerOn() {
        System.out.println("开启电源");
    }

    protected void checkHardware() {
        System.out.println("硬件检查");
    }

    protected void loadOS() {
        System.out.println("载入操作系统");
    }

    protected void login() {
        System.out.println("小白的计算机无验证，直接进入操作系统");
    }

    /**
     * 启动计算机的方法，步骤固定为：开启电源 检查系统 载入系统、用户登录
     * 方法必须为final所修饰 防止算法框架被覆写
     */
    public final void startUp() {
        System.out.println("------开机 START-------");
        powerOn();
        checkHardware();
        loadOS();
        login();
        System.out.println("------开机 END-------");
    }
}
