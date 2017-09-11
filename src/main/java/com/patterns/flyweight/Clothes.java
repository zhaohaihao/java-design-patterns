package com.patterns.flyweight;
/**
 * 享元接口(Flyweight)
 * @author bigsea
 * @date 2017-09-11 上午9:01:06
 */
public interface Clothes {
	
	void buy(UnsharedConcreteClothes unsharedConcreteClothes);
}
