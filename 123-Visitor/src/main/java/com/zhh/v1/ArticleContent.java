package com.zhh.v1;

/**
 * @author zhh
 * @description 文章内容
 * @date 2020-03-03 17:11
 */
public class ArticleContent extends Content {

    public ArticleContent(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
