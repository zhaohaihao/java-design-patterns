package com.patterns.facade;
/**
 * 客户端测试类 Controller
 * @author bigsea
 * @date 2017-08-31 下午10:28:12
 */
public class Controller {
	
	public static void main(String[] args) {
		UserService userService = new UserService();
		
		userService.deleteUserAllInfo("赵海豪");
	}
}
