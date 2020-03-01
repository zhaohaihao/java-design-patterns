package com.zhh.v1;

/**
 * @author zhh
 * @description 减法表达式
 * @date 2020-03-01 18:17
 */
public class SubExpression implements Expression {

    private Expression left;

    private Expression right;

    public SubExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }
}
