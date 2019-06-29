package com.company.composite.files;


public class Client {

    public static void main(String[] args) {

        Dir diskC = new Folder("C");

        diskC.addDir(new File("ImbaMallLog.txt"));

        Dir dirWin = new Folder("Windows");

        dirWin.addDir(new File("explorer.exe"));
        diskC.addDir(dirWin);

        Dir dirPer = new Folder("PerfLogs");
        dirPer.addDir(new File("null.txt"));
        diskC.addDir(dirPer);

        Dir program = new Folder("Program File");
        program.addDir(new File("ftp.txt"));
        diskC.addDir(program);

        diskC.print();
    }
}
