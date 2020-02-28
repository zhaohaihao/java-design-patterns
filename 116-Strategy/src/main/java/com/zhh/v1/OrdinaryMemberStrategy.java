package com.zhh.v1;

/**
 * @author zhh
 * @description 普通会员策略
 * @date 2020-02-28 16:58
 */
public class OrdinaryMemberStrategy implements MemberStrategy {

    public void discount() {
        System.out.println("普通会员不打折");
    }
}
