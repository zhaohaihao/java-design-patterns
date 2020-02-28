package com.zhh.v2;

/**
 * @author zhh
 * @description 铂金会员策略
 * @date 2020-02-28 17:00
 */
public class PlatinumMemberStrategy implements MemberStrategy {

    public void discount() {
        System.out.println("铂金会员所有商品打八八折");
    }
}
