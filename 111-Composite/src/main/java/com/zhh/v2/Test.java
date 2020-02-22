package com.zhh.v2;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-22 15:15
 */
public class Test {

    public static void main(String[] args) {
        String site = "www.zhaohaihao.com";
        // 首页
        MenuComponent index = new MenuItem("首页", site);

        // 编程手册
        MenuCatalog programmingManual = new MenuCatalog("编程手册", 2);
        programmingManual.add(new MenuItem("设计模式", site + "/category/design-patterns"));
        programmingManual.add(new MenuItem("Spring Cloud", site + "/category/spring-cloud"));

        // 主题推荐
        MenuComponent topic = new MenuItem("主题推荐", site + "/topic");

        // 网站导航栏, 顶级目录, 目录层级用1标记
        MenuCatalog main = new MenuCatalog("网站导航目录", 1);
        main.add(index);
        main.add(programmingManual);
        main.add(topic);

        main.print();
    }
}
