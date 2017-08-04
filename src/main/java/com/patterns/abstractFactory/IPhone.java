package com.patterns.abstractFactory;
/**
 * @author bigsea
 * @date 2017-08-04 上午11:00:56
 * 实现Phone接口的具体产品类 IPhone
 */
public class IPhone implements Phone {

	@Override
	public void call() {
		System.out.println("IPhone call...");
	}

}
