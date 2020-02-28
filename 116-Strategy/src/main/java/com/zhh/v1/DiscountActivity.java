package com.zhh.v1;

/**
 * @author zhh
 * @description 打折活动
 * @date 2020-02-28 17:03
 */
public class DiscountActivity {

    private MemberStrategy memberStrategy;

    public DiscountActivity(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    /**
     * 打折
     */
    public void discount() {
        memberStrategy.discount();
    }
}
