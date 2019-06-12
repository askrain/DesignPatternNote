package com.company.command.tetris;

public class TransformCommand implements Command {
    private TetrisMachine tetrisMachine;

    public TransformCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        tetrisMachine.transform();
    }
}
