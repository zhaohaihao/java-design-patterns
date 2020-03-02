package com.zhh.v1;

/**
 * @author zhh
 * @description 接受者类
 * @date 2020-03-02 16:58
 */
public class Staff {

    private String name;

    public Staff(String name) {
        this.name = name;
    }

    /**
     * 发推文
     */
    public void sendTweets() {
        System.out.println(this.name + "早上9点准时在公司公号上发布一篇xx的推文");
    }

    /**
     * 看场地
     */
    public void lookVenue() {
        System.out.println(this.name + "上午和老板一起外出看讲座场地");
    }

    /**
     * 安排会议
     */
    public void attendMeeting() {
        System.out.println(this.name + "安排下午两点的会议");
    }
}
