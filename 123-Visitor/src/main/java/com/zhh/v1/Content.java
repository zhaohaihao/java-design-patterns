package com.zhh.v1;

/**
 * @author zhh
 * @description 内容类
 * @date 2020-03-03 17:08
 */
public abstract class Content {

    /**
     * 名称
     */
    private String name;

    public Content(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 接受操作, 核心方法, 接受访问者访问
     * @param visitor 访问者
     */
    public abstract void accept(Visitor visitor);
}
