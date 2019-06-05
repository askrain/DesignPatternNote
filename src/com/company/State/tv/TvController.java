package com.company.State.tv;

/**
 * 电视遥控器，类似于经典模式中的Context
 */
public class TvController implements PowerController {
    TvState tvState;

    public void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机了");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机了");
    }

    public void nextChannel() {
        tvState.nextChannel();
    }

    public void preChannel() {
        tvState.preChannel();
    }

    public void turnUp() {
        tvState.turnUp();
    }

    public void turnDown() {
        tvState.turnDown();
    }
}
