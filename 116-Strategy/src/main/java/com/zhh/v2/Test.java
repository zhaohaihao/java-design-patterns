package com.zhh.v2;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-28 17:05
 */
public class Test {

    public static void main(String[] args) {
        String member = "黄金会员";
        DiscountActivity discountActivity = new DiscountActivity(MemberStrategyFactory.getMemberStrategy(member));
        discountActivity.discount();
    }
}
