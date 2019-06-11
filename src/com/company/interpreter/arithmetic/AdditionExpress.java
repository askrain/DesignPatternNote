package com.company.interpreter.arithmetic;


//加法运算抽象解释器
public class AdditionExpress extends OperatorExpression {
    public AdditionExpress(ArithmeticExpression exp1,
                           ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
