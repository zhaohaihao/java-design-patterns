package com.patterns.factory2;

/**
 * 
 * @author bigsea
 * @date 2017-07-20 下午3:18:05
 * 工厂类MiPhoneFactory
 */
public class MiPhoneFactory implements PhoneFactory {

	@Override
	public Phone getPhone() {
		return new MiPhone();
	}

}
