package com.patterns.singleton;
/**
 * 
 * @author bigsea
 * @date 2017-07-13 下午12:04:56
 * Singleton - 单例模式 - 双重锁定
 */
public class CDoubleCheckLockingSingleton {
	// 提供私有静态当前类的对象作为变量
	private static CDoubleCheckLockingSingleton instance = null;
			
	// 私有构造方法
	private CDoubleCheckLockingSingleton() {}
			
	// 提供公有静态方法 返回类的实例
	public static CDoubleCheckLockingSingleton getInstance() {
		/*
		 * 此处判断可以避免线程每次都进行一次枷锁,
		 * 只会在实例未被创建的时候进行加锁处理
		 */
		if (instance == null) {
			synchronized (CDoubleCheckLockingSingleton.class) {
				/*
				 * 此处判断防止多个线程同时调用getInstance()
				 * 且满足第一次instance == null判断这种情况,
				 * 在这种情况下若没有此处判断, 
				 * 多线程排队进入锁区执行语句创建新的实例, 
				 * 从而达不到要求
				 */
				if (instance == null) {
					instance = new CDoubleCheckLockingSingleton();
				}
			}
		}
		return instance;
	}
}
