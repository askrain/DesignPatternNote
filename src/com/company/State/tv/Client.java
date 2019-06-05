package com.company.State.tv;


public class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();
//        设置开机状态
        tvController.powerOn();
        tvController.nextChannel();//下一频道
        tvController.turnUp();//调高音量
        tvController.powerOff();//设置关机状态
        tvController.turnDown();//调低音量

    }
}
