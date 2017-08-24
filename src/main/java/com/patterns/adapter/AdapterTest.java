package com.patterns.adapter;
/**
 * 适配器测试类
 * @author bigsea
 * @date 2017-08-24 下午4:31:37
 */
public class AdapterTest {
	
	public static void main(String[] args) {
		UsbInterface usb = new CardReader();
		usb.usbRead();
	}
}
