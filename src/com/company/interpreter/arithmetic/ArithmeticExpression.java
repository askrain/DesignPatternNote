package com.company.interpreter.arithmetic;


//算数运算解释器
public abstract class ArithmeticExpression {
    /**
     * 抽象的解析方法 具体的解析逻辑由具体的子类实现
     *
     * @return 解析得到的具体的值
     */
    public abstract int interpret();
}
