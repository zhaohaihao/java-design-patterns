package com.patterns.flyweight;

import java.util.Random;

/**
 * 享元测试类
 * @author bigsea
 * @date 2017-09-11 上午9:29:49
 */
public class FlyweightTest {
	
	private static final String[] name = { "Shirt", "Sweater", "Slacks" };
	
	private static final String[] size = { "S", "M", "L", "XL", "XXL" };
	
	private static final String[] color = { "Khaki", "ArmyGreen", "White", "Black" };
	
	private static final String[] price = { "￥99", "￥129", "￥149", "￥199" };
	
	
	public static String getRandom(String[] strs) {
		return strs[new Random().nextInt(strs.length)];
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 8; i++) {
			ConcreteClothes concreteClothes = (ConcreteClothes) ClothesFactory.getClothes(getRandom(name));
			concreteClothes.setSize(getRandom(size));
			concreteClothes.setColor(getRandom(color));
			UnsharedConcreteClothes unsharedConcreteClothes = new UnsharedConcreteClothes(getRandom(price));
			concreteClothes.buy(unsharedConcreteClothes);
		}
		
		ClothesFactory.getClothesTypeCount();
	}
}
