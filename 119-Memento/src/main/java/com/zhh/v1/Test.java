package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-03-02 11:36
 */
public class Test {

    public static void main(String[] args) {
        CodeFileMementoManager codeFileMementoManager = new CodeFileMementoManager();

        // 代码文件进行备份
        CodeFile codeFile = new CodeFile("Test", "public class Test {}", "bak-0001");
        CodeFileMemento codeFileMemento = codeFile.saveToMemento();
        codeFileMementoManager.addCodeFileMemento(codeFileMemento);

        // 修改代码文件内容
        codeFile.setContent("public class Test {public static void main(String[] args) {}}");
        codeFile.setCode("bak-0002");

        System.out.println("当前文件内容: " + codeFile);

        // 后悔了, 进行撤销操作
        CodeFileMemento rollbackMemento = codeFileMementoManager.getCodeFileMemento();
        codeFile.undoFromMemento(rollbackMemento);
        System.out.println("执行撤销操作后, 当前文件内容: " + codeFile);
    }
}
