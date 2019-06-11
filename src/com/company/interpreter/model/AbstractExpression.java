package com.company.interpreter.model;

import javax.naming.Context;

//抽象表达式
public abstract class AbstractExpression {
    /**
     * 抽象的解析方法
     *
     * @param ctx 上下文环境
     */
    public abstract void interpret(Context ctx);
}
