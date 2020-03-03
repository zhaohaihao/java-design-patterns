package com.zhh.v1;

/**
 * @author zhh
 * @description 抽象访问者
 * @date 2020-03-03 17:07
 */
public interface Visitor {

    /**
     * 访问文章内容
     * @param articleContent 文章内容
     */
    void visit(ArticleContent articleContent);

    /**
     * 访问资源内容
     * @param resourceContent 资源内容
     */
    void visit(ResourceContent resourceContent);
}
