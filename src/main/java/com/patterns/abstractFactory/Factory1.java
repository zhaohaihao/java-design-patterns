package com.patterns.abstractFactory;
/**
 * @author bigsea
 * @date 2017-08-04 上午11:21:37
 * 利用反射的方式来改进抽象工厂
 */
public class Factory1 {
	public static Phone createPhone(Class clazz) throws Exception {
		return (Phone) clazz.newInstance();
	}
	
	public static Computer createComputer(Class clazz) throws Exception {
		return (Computer) clazz.newInstance();
	}
}
