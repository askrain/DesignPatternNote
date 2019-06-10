package com.company.iterator.complex;

public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;//下一个节点的处理对象

    /**
     * 获取处理者对象的处理级别
     *
     * @return 处理级别
     */
    protected abstract int getHandleLevel();

    /**
     * 每个处理者对象的具体处理方式
     *
     * @param request 请求者对象
     */
    protected abstract void handle(AbstractRequest request);

    public final void handleRequest(AbstractRequest request) {
//        判断当前的处理者对象级别是否与请求者的处理级别一致
        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (nextHandler != null) {//否则，转角请求给下一节点的处理者
                nextHandler.handleRequest(request);
            } else {//都不能处理的时候及时提醒
                System.out.println("All of handler can not handle the " +
                        "request!");
            }
        }

    }
}
