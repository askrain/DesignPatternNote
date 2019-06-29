package com.company.composite.model1;


//抽象根节点
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }


    /**
     * 具体的逻辑方法由子类实现
     */
    public abstract void doSomething();

    /**
     * 添加子节点
     *
     * @param child
     */
    public abstract void addChild(Component child);

    /**
     * 移除子节点
     *
     * @param child
     */
    public abstract void removeChild(Component child);

    /**
     * 获取子节点
     *
     * @param index
     * @return
     */
    public abstract Component getChildren(int index);
}
