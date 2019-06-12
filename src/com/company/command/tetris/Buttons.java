package com.company.command.tetris;


/**
 * 请求者类 命令由按钮发起
 */
public class Buttons {
    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private FallCommand fallCommand;
    private TransformCommand transformCommand;


    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }


    public void toLeft() {
        leftCommand.execute();
    }

    public void toRight() {
        rightCommand.execute();
    }

    public void fall() {
        fallCommand.execute();
    }

    public void transform() {
        transformCommand.execute();
    }
}
