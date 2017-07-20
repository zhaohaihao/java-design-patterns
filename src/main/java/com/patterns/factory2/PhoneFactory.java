package com.patterns.factory2;

/**
 * 
 * @author bigsea
 * @date 2017-07-20 下午3:16:29
 * 抽象工厂接口
 * 对应实体类的工厂需要实现该接口
 * 
 * 说明：
 * 	新建实体类实现实体类共同接口的同时,
 *  也需要新建一个对应创建实体类的工厂类,
 *  且实现该接口
 */
public interface PhoneFactory {
	Phone getPhone();
}
