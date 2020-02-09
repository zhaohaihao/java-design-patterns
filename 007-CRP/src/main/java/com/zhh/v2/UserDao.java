package com.zhh.v2;

/**
 * @author zhh
 * @description 用户数据访问层
 * @date 2020-02-09 13:51
 */
public class UserDao {

    private DBConnection connection;

    public void setConnection(DBConnection connection) {
        this.connection = connection;
    }

    /**
     * 新增用户
     */
    public void addUser() {
        System.out.println(String.format("使用%s添加用户", connection.getConnection()));
    }
}
