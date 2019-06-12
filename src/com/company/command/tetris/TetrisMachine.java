package com.company.command.tetris;


/**
 * 接收者角色：唯一处理具体代码逻辑的地方，其他类都直接或者间接的调用该类
 * 接受者类是个普通的类，任何类都可以作为接收者
 */
public class TetrisMachine {

    public void toLeft() {
        System.out.println("向左");
    }

    public void toRight() {
        System.out.println("向右");
    }

    public void fastToBottom() {
        System.out.println("快速落下");
    }

    public void transform() {
        System.out.println("改变形状");
    }
}
