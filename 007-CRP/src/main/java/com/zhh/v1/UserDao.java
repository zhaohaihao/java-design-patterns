package com.zhh.v1;

/**
 * @author zhh
 * @description 用户数据访问层
 * @date 2020-02-09 13:51
 */
public class UserDao extends DBConnection {

    /**
     * 新增用户
     */
    public void addUser() {
        String connection = super.getConnection();
        System.out.println(String.format("使用%s添加用户", connection));
    }
}
