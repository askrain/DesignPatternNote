package com.company.builder;

/**
 * 计算机抽象类，即Product角色
 */
public abstract class Computer {
    protected String board;
    protected String display;
    protected String os;

    protected Computer() {

    }

    public void setBoard(String board) {
        this.board = board;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer{" +
                "board='" + board + '\'' +
                ", display='" + display + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
