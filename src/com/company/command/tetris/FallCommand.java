package com.company.command.tetris;

public class FallCommand implements Command {
    private TetrisMachine tetrisMachine;

    public FallCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        tetrisMachine.fastToBottom();
    }
}
