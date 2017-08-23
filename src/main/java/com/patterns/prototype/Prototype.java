package com.patterns.prototype;
/**
 * 原型类
 * @author bigsea
 * @date 2017-08-23 下午1:52:38
 */
public class Prototype implements Cloneable {
	
	@Override
	public Prototype clone() throws CloneNotSupportedException {
		return (Prototype) super.clone();
	}
}
