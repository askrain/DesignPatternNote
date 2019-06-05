package com.company.State.tv;


//电视机状态接口，定义了电视操作的函数
//原理：将在不同的状态下有不同的行为这种模式，我们将这些状态用对象来代替，将这些行为封装在对象中
//使得不同的状态下有不同的实现
public interface TvState {
    public void nextChannel();

    public void preChannel();

    public void turnUp();

    public void turnDown();
}
