package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-03-01 18:26
 */
public class Test {

    public static void main(String[] args) {
        String expStr = "10,-,4,+,1";
        ExpressionContext expressionContext = new ExpressionContext();
        int parse = expressionContext.parse(expStr);
        System.out.println("表达式最终的运算结果为: " + parse);
    }
}
