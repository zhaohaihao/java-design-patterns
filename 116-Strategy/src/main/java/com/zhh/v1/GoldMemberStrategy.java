package com.zhh.v1;

/**
 * @author zhh
 * @description 黄金会员策略
 * @date 2020-02-28 16:59
 */
public class GoldMemberStrategy implements MemberStrategy {

    public void discount() {
        System.out.println("黄金会员所有商品打九五折");
    }
}
