package com.zhh.v1;

/**
 * @author zhh
 * @description 注册用户
 * @date 2020-03-03 17:14
 */
public class RegisteredUserVisitor implements Visitor {

    public void visit(ArticleContent articleContent) {
        System.out.println(String.format("CSDN用户访问博客文章[%s]", articleContent.getName()));
    }

    public void visit(ResourceContent resourceContent) {
        System.out.println(String.format("CSDN用户下载博客资源[%s]", resourceContent.getName()));
    }
}
