package com.patterns.factory1;

/**
 * 
 * @author bigsea
 * @date 2017-07-20 下午2:56:48
 * 实体类MiPhone 实现Phone接口
 */
public class MiPhone implements Phone {

	@Override
	public void call() {
		System.out.println("MiPhone call...");
	}

}
