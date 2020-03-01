package com.zhh.v1;

/**
 * @author zhh
 * @description 数字表达式
 * @date 2020-03-01 18:21
 */
public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Integer.valueOf(number);
    }

    public int interpret() {
        return this.number;
    }

    @Override
    public String toString() {
        return String.format("%s", this.number);
    }
}
