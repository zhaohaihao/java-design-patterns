package com.patterns.bridge;
/**
 * Shape 的具体实现类 Circle
 * @author bigsea
 * @date 2017-08-28 上午8:54:07
 */
public class Circle extends Shape {

	@Override
	public String draw() {
		return "画圆";
	}

}
