package com.company.command.tetris;

public class LeftCommand implements Command {
    private TetrisMachine tetrisMachine;

    public LeftCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        tetrisMachine.toLeft();
    }
}
