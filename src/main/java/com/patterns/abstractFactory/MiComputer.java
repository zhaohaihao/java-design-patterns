package com.patterns.abstractFactory;
/**
 * @author bigsea
 * @date 2017-08-04 上午11:06:51
 * 实现Computer接口的具体产品类MiComputer
 */
public class MiComputer implements Computer {

	@Override
	public void play() {
		System.out.println("MiComputer play...");
	}

}
