package com.company.iterator.complex;


//抽象请求者
public abstract class AbstractRequest {
    private Object obj;//处理对象

    public AbstractRequest(Object object) {
        this.obj = object;
    }

    /**
     * 获取处理的内容对象
     *
     * @return
     */
    public Object getContent() {
        return obj;
    }

    /**
     * 获取请求级别
     *
     * @return 请求级别
     */
    public abstract int getRequestLevel();
}
