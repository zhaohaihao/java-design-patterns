package com.patterns.facade;
/**
 * 子系统类 DailyDao
 * @author bigsea
 * @date 2017-08-31 下午10:20:29
 */
public class DailyDao {

	public void deleteDaily(String userName) {
		System.out.println(userName + " 用户相关日志删除成功...");
	}
}
