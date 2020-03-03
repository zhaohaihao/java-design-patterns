package com.zhh.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhh
 * @description 博客类
 * @date 2020-03-03 17:34
 */
public class Blog {

    private List<Content> contentList = new ArrayList<Content>();

    /**
     * 添加内容
     * @param content 内容
     */
    public void addContent(Content content) {
        contentList.add(content);
    }

    /**
     * 删除内容
     * @param content 内容
     */
    public void removeContent(Content content) {
        contentList.remove(content);
    }

    /**
     * 接受访问者访问
     * @param visitor 访问者
     */
    public void accept(Visitor visitor) {
        for (Content content : contentList) {
            content.accept(visitor);
        }
    }
}
