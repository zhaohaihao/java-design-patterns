package com.zhh.v2;

import java.util.Date;

/**
 * @author zhh
 * @description 简历类
 * @date 2020-02-13 00:13
 */
public class Resume implements Cloneable {

    /**
     * 姓名
     */
    private String name;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别
     */
    private String sex;

    /**
     * 学校
     */
    private String school;

    /**
     * 工龄
     */
    private String socialWorkAge;

    /**
     * 公司
     */
    private String company;

    /**
     * 工作描述
     */
    private String workDescription;

    public Resume() {
        System.out.println("Resume类的无参构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSocialWorkAge() {
        return socialWorkAge;
    }

    public void setSocialWorkAge(String socialWorkAge) {
        this.socialWorkAge = socialWorkAge;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("开始克隆简历");
        return super.clone();
    }

    public void display() {
        System.out.println(String.format("姓名: %s", name));
        System.out.println(String.format("生日: %s, 性别: %s, 毕业院校: %s, 工龄: %s", birthday, sex, school, socialWorkAge));
        System.out.println(String.format("公司: %s, 工作描述: %s", company, workDescription));
    }
}
