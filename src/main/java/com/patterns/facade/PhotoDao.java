package com.patterns.facade;
/**
 * 子系统类 PhotoDao
 * @author bigsea
 * @date 2017-08-31 下午10:22:26
 */
public class PhotoDao {

	public void deletePhoto(String userName) {
		System.out.println(userName + " 用户相关照片删除成功...");
	}
}
