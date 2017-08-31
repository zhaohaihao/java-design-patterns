package com.patterns.facade;
/**
 * 外观类 UserService
 * @author bigsea
 * @date 2017-08-31 下午10:24:30
 */
public class UserService {
	
	UserDao userDao;
	DailyDao dailyDao;
	PhotoDao photoDao;
	
	public UserService() {
		userDao = new UserDao();
		dailyDao = new DailyDao();
		photoDao = new PhotoDao();
	}
	
	public void deleteUserAllInfo(String userName) {
		userDao.deleteUser(userName);
		dailyDao.deleteDaily(userName);
		photoDao.deletePhoto(userName);
	}
}
