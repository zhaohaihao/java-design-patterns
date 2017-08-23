package com.patterns.prototype;
/**
 * 原型测试类
 * @author bigsea
 * @date 2017-08-23 下午1:54:32
 */
public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		ConcreatePrototype cp = new ConcreatePrototype();
		
		ConcreatePrototype clone1 = (ConcreatePrototype) cp.clone();
		ConcreatePrototype clone2 = (ConcreatePrototype) cp.clone();
		
		cp.print();
		clone1.print();
		clone2.print();
	}
}
