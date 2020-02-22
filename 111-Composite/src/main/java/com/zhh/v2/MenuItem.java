package com.zhh.v2;

/**
 * @author zhh
 * @description 菜单项类
 * @date 2020-02-22 11:44
 */
public class MenuItem extends MenuComponent {

    /**
     * 菜单项名称
     */
    private String name;

    /**
     * 页面访问地址
     */
    private String url;

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getUrl(MenuComponent menuComponent) {
        return this.url;
    }

    @Override
    public String getName(MenuComponent menuComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(String.format("%s, 菜单项的页面访问地址是: %s", name, url));
    }
}
