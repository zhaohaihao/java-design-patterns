package com.zhh.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhh
 * @description 调用者类
 * @date 2020-03-02 16:43
 */
public class Boss {

    private List<Command> commandList = new ArrayList<Command>();

    /**
     * 添加命令
     * @param command 命令
     */
    public void addCommand(Command command) {
        commandList.add(command);
    }

    /**
     * 发送命令
     */
    public void sendCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
