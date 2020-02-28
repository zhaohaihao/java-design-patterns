package com.zhh.v1;

/**
 * @author zhh
 * @description 钻石会员策略
 * @date 2020-02-28 17:01
 */
public class DiamondMemberStrategy implements MemberStrategy {

    public void discount() {
        System.out.println("钻石会员所有商品打八折");
    }
}
