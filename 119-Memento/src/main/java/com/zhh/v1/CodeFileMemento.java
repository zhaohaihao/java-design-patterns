package com.zhh.v1;

/**
 * @author zhh
 * @description 代码文件备份
 * @date 2020-03-02 11:26
 */
public class CodeFileMemento {

    /**
     * 类名
     */
    private String className;

    /**
     * 内容
     */
    private String content;

    /**
     * 备份编号
     */
    private String code;

    public CodeFileMemento(String className, String content, String code) {
        this.className = className;
        this.content = content;
        this.code = code;
    }

    public String getClassName() {
        return className;
    }

    public String getContent() {
        return content;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "CodeFileMemento{" + "className='" + className + '\'' + ", content='" + content + '\'' + ", code='" +
                code + '\'' + '}';
    }
}
