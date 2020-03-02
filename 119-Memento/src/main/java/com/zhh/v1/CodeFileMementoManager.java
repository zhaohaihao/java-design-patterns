package com.zhh.v1;

import java.util.Stack;

/**
 * @author zhh
 * @description 代码文件备份管理器
 * @date 2020-03-02 11:31
 */
public class CodeFileMementoManager {

    private final Stack<CodeFileMemento> CODE_FILE_MEMENTO_STACK = new Stack<CodeFileMemento>();

    /**
     * 获取代码文件备份
     */
    public CodeFileMemento getCodeFileMemento() {
        return CODE_FILE_MEMENTO_STACK.pop();
    }

    /**
     * 添加代码文件备份
     * @param codeFileMemento 代码文件备份
     */
    public void addCodeFileMemento(CodeFileMemento codeFileMemento) {
        CODE_FILE_MEMENTO_STACK.push(codeFileMemento);
    }
}
