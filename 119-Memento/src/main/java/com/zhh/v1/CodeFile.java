package com.zhh.v1;

/**
 * @author zhh
 * @description 代码文件(发起人)
 * @date 2020-03-02 11:22
 */
public class CodeFile {

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

    public CodeFile(String className, String content, String code) {
        this.className = className;
        this.content = content;
        this.code = code;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 创建代码文件备份
     */
    public CodeFileMemento saveToMemento() {
        System.out.println("创建了一个新的备份, 备份编号: " + this.code);
        return new CodeFileMemento(this.className, this.content, this.code);
    }

    /**
     * 撤销至某个备份
     * @param codeFileMemento 代码文件备份
     */
    public void undoFromMemento(CodeFileMemento codeFileMemento) {
        System.out.println("撤销代码文件至原先备份, 内容为: " + codeFileMemento);
        this.className = codeFileMemento.getClassName();
        this.content = codeFileMemento.getContent();
        this.code = codeFileMemento.getCode();
    }

    @Override
    public String toString() {
        return "CodeFile{" + "className='" + className + '\'' + ", content='" + content + '\'' + ", code='" + code +
                '\'' + '}';
    }
}
