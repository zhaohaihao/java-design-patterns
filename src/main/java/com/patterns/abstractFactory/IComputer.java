package com.patterns.abstractFactory;
/**
 * @author bigsea
 * @date 2017-08-04 上午11:04:47
 * 实现Computer接口的具体产品类IComputer
 */
public class IComputer implements Computer {

	@Override
	public void play() {
		System.out.println("IComputer play...");
	}

}
