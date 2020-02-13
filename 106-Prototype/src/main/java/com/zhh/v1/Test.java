package com.zhh.v1;

import java.util.Date;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-13 00:20
 */
public class Test {

    public static void main(String[] args) throws Exception {
        // 原版简历
        Resume resumeA = new Resume();
        resumeA.setName("海豪");
        resumeA.setBirthday(new Date(94, 0, 1));
        resumeA.setSex("男");
        resumeA.setSchool("XXXX大学");
        resumeA.setSocialWorkAge("1");
        resumeA.setCompany("A科技有限公司");
        resumeA.setWorkDescription("在A公司的工作描述");

        // 拷贝简历改版
        Resume resumeB = (Resume) resumeA.clone();
        resumeB.setSocialWorkAge("3");
        resumeB.setCompany("B科技有限公司");
        resumeB.setWorkDescription("在B公司的工作描述");

        System.out.println("=====简历修改前=====");
        resumeA.display();
        System.out.println("=====简历修改后=====");
        resumeB.display();

        System.out.println("是否为同一对象: " + (resumeA == resumeB));
    }
}
