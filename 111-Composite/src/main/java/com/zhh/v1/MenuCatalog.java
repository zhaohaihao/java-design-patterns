package com.zhh.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhh
 * @description 菜单目录类
 * @date 2020-02-22 15:03
 */
public class MenuCatalog extends MenuComponent {

    /**
     * 菜单目录名称
     */
    private String name;

    /**
     * 菜单目录层级, 方便区分
     */
    private Integer level;

    /**
     * 子菜单项列表
     */
    private List<MenuComponent> menuItems = new ArrayList<MenuComponent>();

    public MenuCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuItems.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuItems.remove(menuComponent);
    }

    @Override
    public String getName(MenuComponent menuComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (MenuComponent menuComponent : menuItems) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("*");
                }
            }
            menuComponent.print();
        }
    }
}
