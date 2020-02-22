package com.zhh.v1;

/**
 * @author zhh
 * @description 菜单组件类
 * @date 2020-02-22 11:13
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getUrl(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持获取地址操作");
    }

    public abstract String getName(MenuComponent menuComponent);

    public abstract void print();
}
