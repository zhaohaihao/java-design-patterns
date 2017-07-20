package com.patterns.factory2;

/**
 * 
 * @author bigsea
 * @date 2017-07-20 下午3:19:30
 * 工厂测试类
 * 
 * 说明：
 * 	工厂模式, 也叫做多态性工厂模式
 *  定义一个用于床架对象的接口, 让子类来决定实例化哪个类, 工厂方法使一个类的实例化延迟到其子类
 *  
 *  当我们需要新添加实体类的时候,
 *  在增加新的实体类实现实体类共同接口Phone的同时,
 *  只需要再新建一个创建实体类对象的工厂类并且实现我们的PhoneFactory方法即可
 *  这里很好的解决了简单工厂方法中违反开闭原则的问题
 *  
 * 适用:
 * 	需要大量创建不同的对象, 且这些对象的实体类具有共同的接口
 */
public class FactoryTest {
	public static void main(String[] args) {
		PhoneFactory pf = new IPhoneFactory();
		Phone p = pf.getPhone();
		p.call();
	}
}
