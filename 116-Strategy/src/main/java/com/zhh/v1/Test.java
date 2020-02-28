package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-28 17:05
 */
public class Test {

    public static void main(String[] args) {
        String member = "黄金会员";
        DiscountActivity discountActivity;

        if ("黄金会员".equals(member)) {
            discountActivity = new DiscountActivity(new GoldMemberStrategy());
        } else if ("铂金会员".equals(member)) {
            discountActivity = new DiscountActivity(new PlatinumMemberStrategy());
        } else if ("钻石会员".equals(member)) {
            discountActivity = new DiscountActivity(new DiamondMemberStrategy());
        } else {
            discountActivity = new DiscountActivity(new OrdinaryMemberStrategy());
        }

        discountActivity.discount();
    }
}
