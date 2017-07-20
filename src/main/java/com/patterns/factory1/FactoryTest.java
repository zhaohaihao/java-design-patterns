package com.patterns.factory1;

/**
 * 
 * @author bigsea
 * @date 2017-07-20 下午3:06:54
 * 工厂测试类
 * 
 * 说明：
 * 	简单工厂模式, 是工厂模式的一个特殊实现, 也叫作静态工厂模式
 *  客户端不关心实体类对象创建的具体过程 达到解耦的效果
 *  客户端根绝输入的参数条件动态的去实例化对应的实体类
 *  
 *  但是当我们需要新添加实体类的时候,
 *  在增加新的实体类实现实体类共同接口Phone的同时,
 *  还需要在工厂类PhoneFactory当中的静态工厂方法getPhone中加入分支,
 *  修改了原本的工厂类, 不符合我们的开闭原则
 *  
 * 适用:
 *  工厂类负责创建的对象比较少
 *  客户端只关心传入的参数, 不关心内部的具体实现
 */
public class FactoryTest {
	public static void main(String[] args) {
		Phone phone = PhoneFactory.getPhone("iphone");
		if (phone != null) {
			phone.call();
		} else {
			System.out.println("无此手机类型...");
		}
	}
}
