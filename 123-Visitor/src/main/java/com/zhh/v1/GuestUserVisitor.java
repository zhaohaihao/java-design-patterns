package com.zhh.v1;

/**
 * @author zhh
 * @description 非注册用户
 * @date 2020-03-03 17:06
 */
public class GuestUserVisitor implements Visitor {

    public void visit(ArticleContent articleContent) {
        System.out.println(String.format("匿名用户访问博客文章[%s]", articleContent.getName()));
    }

    public void visit(ResourceContent resourceContent) {
        if (resourceContent.isNeedLogin()) {
            System.out.println("匿名用户无法访问当前资源, 请登录!");
            return;
        }
        System.out.println(String.format("匿名用户下载博客资源[%s]", resourceContent.getName()));
    }
}
