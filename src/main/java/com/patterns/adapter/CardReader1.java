package com.patterns.adapter;
/**
 * 读卡器(适配器) -- 对象适配器
 * 将SD接口转换成USB接口
 * @author bigsea
 * @date 2017-08-24 下午4:38:01
 */
public class CardReader1 implements UsbInterface {
	
	private SDInterface sd;
	
	public CardReader1(SDInterface sd) {
		this.sd = sd;
	}
	
	@Override
	public void usbRead() {
		sd.sdRead();
		System.out.println("读卡器转换...");
		System.out.println("USB接口读取...");
	}

}
