package com.zhh.v1;

/**
 * @author zhh
 * @description 加法表达式
 * @date 2020-03-01 18:17
 */
public class AddExpression implements Expression {

    private Expression left;

    private Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }
}
