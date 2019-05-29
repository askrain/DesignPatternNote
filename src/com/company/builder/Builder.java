package com.company.builder;


/**
 * 抽象Buider类
 */
public abstract class Builder {
    public abstract void buildBoard(String board);

    public abstract void buildDisplay(String display);

    public abstract void buildOS();

    public abstract Computer create();//创建Computer
}
