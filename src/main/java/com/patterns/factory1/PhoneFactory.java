package com.patterns.factory1;

/**
 * 
 * @author bigsea
 * @date 2017-07-20 下午2:59:14
 * 工厂类 依据传入的参数不用 生成不同的实体对象
 * 
 * 说明：
 *   新建实体类实现接口的同时, 需要在该类的静态方法下增加一个分支
 */
public class PhoneFactory {
	// 静态工厂方法
	public static Phone getPhone(String type) {
		if ("iphone".equalsIgnoreCase(type)) {
			return new IPhone();
		} else if ("miphone".equalsIgnoreCase(type)) {
			return new MiPhone();
		}
		return null;
	}
}
