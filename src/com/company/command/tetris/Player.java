package com.company.command.tetris;

public class Player {

    public static void main(String[] args) {
        TetrisMachine tetrisMachine = new TetrisMachine();

        LeftCommand leftCommand = new LeftCommand(tetrisMachine);
        RightCommand rightCommand = new RightCommand(tetrisMachine);
        FallCommand fallCommand = new FallCommand(tetrisMachine);
        TransformCommand transformCommand = new TransformCommand(tetrisMachine);

        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFallCommand(fallCommand);
        buttons.setTransformCommand(transformCommand);


        buttons.toLeft();
        buttons.fall();
        buttons.transform();
        buttons.toRight();
        buttons.fall();
    }
}
