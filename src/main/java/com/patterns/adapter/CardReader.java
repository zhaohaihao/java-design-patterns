package com.patterns.adapter;
/**
 * 读卡器(适配器) -- 类适配器
 * 将SD接口转换成USB接口
 * @author bigsea
 * @date 2017-08-24 下午4:25:23
 */
public class CardReader extends SDInterface implements UsbInterface {

	@Override
	public void usbRead() {
		super.sdRead();
		System.out.println("读卡器转换...");
		convert();
	}
	
	public void convert() {
		System.out.println("USB接口读取...");
	}
}
