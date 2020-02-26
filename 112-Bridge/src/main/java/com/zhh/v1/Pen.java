package com.zhh.v1;

/**
 * @author zhh
 * @description 笔类
 * @date 2020-02-26 14:52
 */
public abstract class Pen {

    /**
     * 笔的名称
     */
    private String name;

    public Pen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void draw();
}
