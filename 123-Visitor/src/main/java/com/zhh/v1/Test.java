package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-03-03 17:34
 */
public class Test {

    public static void main(String[] args) {
        // 创建对象结构
        Blog blog = new Blog();

        // 创建具体元素
        Content articleContent = new ArticleContent("Java设计模式之行为型-访问者模式 (Visitor)");
        Content resourceContent = new ResourceContent("代码生成器工具.zip", true);

        blog.addContent(articleContent);
        blog.addContent(resourceContent);

        // 创建不同访问对象
        Visitor registeredUserVisitor = new RegisteredUserVisitor();
        Visitor guestUserVisitor = new GuestUserVisitor();

        // 不同对象分别访问数据
        blog.accept(registeredUserVisitor);
        blog.accept(guestUserVisitor);
    }
}
