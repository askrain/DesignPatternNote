package com.company.iterator.simple;

public abstract class Handler {
    protected Handler successor;//下一节点的处理者

    /**
     * 处理请求
     *
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);
}
