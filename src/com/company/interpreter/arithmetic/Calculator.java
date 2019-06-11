package com.company.interpreter.arithmetic;


import java.util.Stack;

//处理与解释一些相关的业务
public class Calculator {
    private Stack<ArithmeticExpression> expStacks = new Stack<>();

    public Calculator(String expression) {
        ArithmeticExpression exp1, exp2;//声明两个临时变量，存储运算符左右两边的数字解释器
        String[] elements = expression.split(" ");//根据空格分隔表达式
        for (int i = 0; i < elements.length; i++) {
            //判断运算符号
            switch (elements[i].charAt(0)) {
                case '+':
                    exp1 = expStacks.pop();//将栈中的解释器弹出作为运算符号左边的解释器
//                    同时将运算符号数组下标下一个元素构造为一个数字解释器
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
//                    通过上面两个数字解释器构造加法解释器
                    expStacks.push(new AdditionExpress(exp1, exp2));
                    break;
                case '-':
                    exp1 = expStacks.pop();//将栈中的解释器弹出作为运算符号左边的解释器
//                    同时将运算符号数组下标下一个元素构造为一个数字解释器
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
//                    通过上面两个数字解释器构造加法解释器
                    expStacks.push(new SubtractionExpression(exp1, exp2));
                    break;
                default://直接构造数字解释器并压入栈
                    expStacks.push(new NumExpression(Integer.valueOf(elements[i])));

            }
        }

    }


    /**
     * 最终的计算结果
     *
     * @return
     */
    public int calculate() {
        return expStacks.pop().interpret();
    }
}
