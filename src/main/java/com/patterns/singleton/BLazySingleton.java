package com.patterns.singleton;

/**
 * 
 * @author bigsea
 * @date 2017-07-13 上午10:41:16
 * Singleton - 单例模式(懒汉式) - 线程安全
 * 
 * 说明：
 * 	synchronized 同步方法, 一次只有一个线程能够执行此方法
 * 	虽能在多线程环境下能保证单例, 但是效率较低
 *  且并不是所有的情况都需要调用, 只需要在实例未创建的时候进行处理
 *  修改参见 CDoubleCheckLockingSingleton
 */
public class BLazySingleton {
	// 提供私有静态当前类的对象作为变量
	private static BLazySingleton instance = null;
		
	// 私有构造方法
	private BLazySingleton() {}
		
	// 提供公有静态方法 返回类的实例
	public static synchronized BLazySingleton getInstance() {
		if (instance == null) {
			instance = new BLazySingleton();
		}
		return instance;
	}
}
