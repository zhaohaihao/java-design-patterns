package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-03-03 12:53
 */
public class Test {

    public static void main(String[] args) {
        // 创建中介者对象
        WorkGroup weChatWorkGroup = new WeChatWorkGroup();

        // 创建具体同事对象
        Boss boss = new Boss(weChatWorkGroup);
        PersonnelManager personnelManager = new PersonnelManager(weChatWorkGroup);
        Staff staffA = new Staff(weChatWorkGroup, "海豪");
        Staff staffB = new Staff(weChatWorkGroup, "亚萍");

        System.out.println(">>>>>");
        personnelManager.sendMessage("@所有人 由于近期新冠疫情影响，公司决定延迟复工, 具体时间另行通知, 收到请回复!");
        System.out.println("<<<<<");
        System.out.println();

        System.out.println(">>>>>");
        boss.sendMessage("疫情期间没事不要外出, 勤洗手, 戴口罩, 大家注意安全哦~");
        System.out.println("<<<<<");
        System.out.println();

        System.out.println(">>>>>");
        staffA.sendMessage("收到");
        System.out.println("<<<<<");
        System.out.println();

        System.out.println(">>>>>");
        staffB.sendMessage("收到");
        System.out.println("<<<<<");
    }
}
