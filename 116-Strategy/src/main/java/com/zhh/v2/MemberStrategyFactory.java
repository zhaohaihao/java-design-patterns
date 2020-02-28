package com.zhh.v2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhh
 * @description 会员策略工厂
 * @date 2020-02-28 17:24
 */
public class MemberStrategyFactory {

    private static Map<String, MemberStrategy> MEMBER_STRATEGY_MAP = new HashMap<String, MemberStrategy>();

    static {
        init();
    }

    private MemberStrategyFactory() {}

    /**
     * 获取会员策略
     * @param member 会员等级
     */
    public static MemberStrategy getMemberStrategy(String member) {
        MemberStrategy memberStrategy = MEMBER_STRATEGY_MAP.get(member);
        return memberStrategy == null ? MEMBER_STRATEGY_MAP.get(MemberKey.ORDINARY) : memberStrategy;
    }

    /**
     * 初始化操作
     */
    private static void init() {
        MEMBER_STRATEGY_MAP.put(MemberKey.ORDINARY, new OrdinaryMemberStrategy());
        MEMBER_STRATEGY_MAP.put(MemberKey.GOLD, new GoldMemberStrategy());
        MEMBER_STRATEGY_MAP.put(MemberKey.PLATINUM, new PlatinumMemberStrategy());
        MEMBER_STRATEGY_MAP.put(MemberKey.DIAMOND, new DiamondMemberStrategy());
    }

    /**
     * 会员键值
     */
    private interface MemberKey {
        String ORDINARY = "普通会员";
        String GOLD = "黄金会员";
        String PLATINUM = "铂金会员";
        String DIAMOND = "钻石会员";
    }
}
