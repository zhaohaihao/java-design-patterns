package com.patterns.singleton;

/**
 * 
 * @author bigsea
 * @date 2017-07-13 上午10:17:40
 * Singleton - 单例模式(懒汉式) - 线程不安全
 * 
 * 说明：
 * 	当前这种方法适用单线程, 在多线程的环境下会出现问题
 *  当多线程同时调用getInstance()时, 多个线程可能获得类的不同实例
 *  
 *  为解决懒汉式多线程不安全问题 参见BLazySingleton类
 */
public class ALazySingleton {
	// 提供私有静态当前类的对象作为变量
	private static ALazySingleton instance = null;
	
	// 私有构造方法
	private ALazySingleton() {}
	
	// 提供公有静态方法 返回类的实例
	public static ALazySingleton getInstance() {
		if (instance == null) {
			instance = new ALazySingleton();
		}
		return instance;
	}
}
