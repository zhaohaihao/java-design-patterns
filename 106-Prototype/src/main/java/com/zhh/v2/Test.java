package com.zhh.v2;

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

        // 拷贝简历
        Resume resumeB = (Resume) resumeA.clone();

        System.out.println("=====原版简历=====");
        resumeA.display();
        System.out.println("=====拷贝简历=====");
        resumeB.display();

        resumeA.getBirthday().setDate(5);

        System.out.println();
        System.out.println("=====修改后原版简历=====");
        resumeA.display();
        System.out.println("=====修改后拷贝简历=====");
        resumeB.display();
    }
}
