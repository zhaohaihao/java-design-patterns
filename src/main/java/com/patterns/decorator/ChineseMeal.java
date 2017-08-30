package com.patterns.decorator;
/**
 * 具体的对象类(ConcreteComponent)
 * @author bigsea
 * @date 2017-08-30 下午4:55:33
 */
public class ChineseMeal implements Dinner {

	@Override
	public void eat() {
		System.out.println("-----中餐套餐-----");
	}
}
