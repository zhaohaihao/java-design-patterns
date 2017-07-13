package com.patterns.singleton;
/**
 * 
 * @author bigsea
 * @date 2017-07-13 下午1:23:30
 * Singleton - 单例模式(登记式)
 * 
 * 说明：
 * 	这种方式能达到与双重锁定方式一样的功效, 但实现更简单.
 * 	对静态域使用延迟初始化, 应使用这种方式而不是双重锁定.
 *  这种方式只适用于静态域的情况, 双重锁定方式可在实例域需要延迟初始化时使用.
 */
public class ERegisterSingleton {
	/*
	 * 私有的内部静态类
	 * 当单例类ERegisterSingleton加载的时候,
	 * 静态内部类RegisterSingletonHolder并不会被加载到内存当中,
	 * 只有当我们调用单例类的getInstance()方法时,
	 * 静态内部类才会被加载并且创建ERegisterSingleton类的实例
	 */
	private static class RegisterSingletonHolder {
		private static final ERegisterSingleton INSTANCE = new ERegisterSingleton();
	}
	
	// 私有构造方法
	private ERegisterSingleton() {}
	
	// 提供公有静态方法 返回类的实例
	public static final ERegisterSingleton getInstance() {
		return RegisterSingletonHolder.INSTANCE;
	}
}
