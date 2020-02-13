package com.zhh.v2;

/**
 * @author zhh
 * @description 病人类
 * @date 2020-02-13 16:21
 */
public class Patient {

    /**
     * 姓名
     */
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
