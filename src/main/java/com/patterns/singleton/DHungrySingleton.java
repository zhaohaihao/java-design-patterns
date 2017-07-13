package com.patterns.singleton;
/**
 * 
 * @author bigsea
 * @date 2017-07-13 下午1:14:59
 * Singleton - 单例模式(饿汉式)
 * 
 * 说明:
 * 	在类加载的时候创建了实例完成了初始化.
 *  这种方式没有懒加载的效果,
 *  只要类加载了就进行初始化, 不考虑类过程中是否需要使用, 从而造成内存浪费
 *  为解决该问题 可参见ERegisterSingleton类
 */
public class DHungrySingleton {
	// 提供私有静态当前类的对象作为变量
	private static DHungrySingleton instance = new DHungrySingleton();
		
	// 私有构造方法
	private DHungrySingleton() {}
	
	// 提供公有静态方法 返回类的实例
	public static DHungrySingleton getInstance() {
		return instance;
	}
}
