package com.patterns.bridge;
/**
 * Shape 的具体实现类 Square
 * @author bigsea
 * @date 2017-08-28 上午8:55:06
 */
public class Square extends Shape {

	@Override
	public String draw() {
		return "画正方形";
	}

}
