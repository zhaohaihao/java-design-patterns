package com.zhh.v1;

import java.util.Stack;

/**
 * @author zhh
 * @description 表达式环境角色
 * @date 2020-03-01 18:23
 */
public class ExpressionContext {

    private Expression expression;

    /**
     * 解析
     * @param expStr 字符串表达式
     */
    public int parse(String expStr) {
        final Stack<Expression> stack = new Stack<Expression>();

        String[] expArray = expStr.split(",");

        Expression left;
        Expression right;

        for (int i = 0; i < expArray.length; i++) {
            String exp = expArray[i];
            if (isSymbol(exp)) {
                // +或者-运算符号
                left = stack.pop();
                right = new NumberExpression(expArray[++i]);
                System.out.println(String.format("数字%s和%s开始进行%s操作运算", left, right, exp));
                Expression expression = getExpression(left, right, exp);

                int result = expression.interpret();
                System.out.println(String.format("运算结果%s开始入栈", result));
                stack.push(new NumberExpression(result));
            } else {
                // 数字
                NumberExpression numberExpression = new NumberExpression(exp);
                System.out.println(String.format("数字%s开始入栈", numberExpression));
                stack.push(numberExpression);
            }
        }

        return stack.pop().interpret();
    }

    /**
     * 是否是符号
     * @param exp 表达式
     */
    private boolean isSymbol(String exp) {
        return "+".equals(exp) || "-".equals(exp);
    }

    /**
     * 获取表达式
     * @param left 左表达式
     * @param right 右表达式
     * @param symbol 运算符号
     * @return
     */
    private Expression getExpression(Expression left, Expression right, String symbol) {
        if ("+".equals(symbol)) {
            return new AddExpression(left, right);
        } else if ("-".equals(symbol)) {
            return new SubExpression(left, right);
        } else {
            throw new RuntimeException(String.format("当前解析器不支持该操作符%s的解析", symbol));
        }
    }
}
