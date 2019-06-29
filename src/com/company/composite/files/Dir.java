package com.company.composite.files;


import java.util.ArrayList;
import java.util.List;

//表示文件和文件夹的抽象类
public abstract class Dir {

    /**
     * 声明一个list成员变量存储文件夹下的所有元素
     */
    protected List<Dir> dirs = new ArrayList<>();

    private String name;

    public Dir(String name) {
        this.name = name;
    }

    /**
     * 获取文件或者文件夹的名字
     *
     * @return
     */
    public String getName() {
        return name;
    }


    /**
     * 添加一个文件或者文件夹
     *
     * @param dir
     */
    public abstract void addDir(Dir dir);

    /**
     * 移除一个文件或者文件夹
     *
     * @param dir
     */
    public abstract void rmDir(Dir dir);

    /**
     * 清空文件夹下的所有元素
     */
    public abstract void clear();

    /**
     * 输出文件夹目录结构
     */
    public abstract void print();

    /**
     * 得到文件夹下所有文件或者文件夹
     *
     * @return
     */
    public abstract List<Dir> getFiles();

}
