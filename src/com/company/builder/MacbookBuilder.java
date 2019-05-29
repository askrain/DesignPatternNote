package com.company.builder;

/**
 * 具体的Builder类 MacbookBuilder
 */
public class MacbookBuilder extends Builder {
    Computer computer = new Macbook();

    @Override
    public void buildBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        computer.setOs();
    }

    @Override
    public Computer create() {
        return computer;
    }
}
