package com.patterns.abstractFactory;
/**
 * @author bigsea
 * @date 2017-08-04 上午11:01:51
 * 实现Phone接口的具体产品类MiPhone
 */
public class MiPhone implements Phone {

	@Override
	public void call() {
		System.out.println("MiPhone call...");
	}

}
