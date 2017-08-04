package com.patterns.abstractFactory;
/**
 * @author bigsea
 * @date 2017-08-04 上午11:18:08
 * 创建实现Factory接口的具体工厂类 MiFactory
 * 这里的两个方法所产生的具体产品构成一个产品族
 */
public class MiFactory implements Factory {

	@Override
	public Phone createPhone() {
		return new MiPhone();
	}

	@Override
	public Computer createComputer() {
		return new MiComputer();
	}

}
