package com.patterns.factory2;

/**
 * 
 * @author bigsea
 * @date 2017-07-20 下午2:55:22
 * 实体类IPhone 实现 Phone接口
 */
public class IPhone implements Phone {

	@Override
	public void call() {
		System.out.println("IPhone call...");
	}

}
