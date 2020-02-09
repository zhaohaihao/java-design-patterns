package com.zhh.v2;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-09 13:53
 */
public class Test {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.setConnection(new MySQLConnection());
        userDao.addUser();

        userDao.setConnection(new OracleConnection());
        userDao.addUser();
    }
}
