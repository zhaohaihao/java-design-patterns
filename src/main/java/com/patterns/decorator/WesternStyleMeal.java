package com.patterns.decorator;
/**
 * 具体的对象类(ConcreteComponent)
 * @author bigsea
 * @date 2017-08-30 下午4:56:44
 */
public class WesternStyleMeal implements Dinner {

	@Override
	public void eat() {
		System.out.println("-----西餐套餐-----");
	}
}
