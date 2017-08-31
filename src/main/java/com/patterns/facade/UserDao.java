package com.patterns.facade;
/**
 * 子系统类 UserDao
 * @author bigsea
 * @date 2017-08-31 下午10:18:13
 */
public class UserDao {
	
	public void deleteUser(String userName) {
		System.out.println(userName + " 用户基本信息删除成功...");
	}
}
