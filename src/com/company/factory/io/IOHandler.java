package com.company.factory.io;


//数据持久化抽象类
public abstract class IOHandler {
    /**
     * @param id   身份证id
     * @param name 身份证名字
     */
    public abstract void add(String id, String name);

    public abstract void delete(String id);

    public abstract void update(String id, String name);

    public abstract String query(String id);
}
