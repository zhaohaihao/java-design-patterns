package com.patterns.factory2;

/**
 * 
 * @author bigsea
 * @date 2017-07-20 下午3:18:10
 * 工厂类IPhoneFactory
 */
public class IPhoneFactory implements PhoneFactory {

	@Override
	public Phone getPhone() {
		return new IPhone();
	}

}
