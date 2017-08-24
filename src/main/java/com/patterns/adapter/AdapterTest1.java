package com.patterns.adapter;
/**
 * 适配器测试类
 * @author bigsea
 * @date 2017-08-24 下午4:31:37
 */
public class AdapterTest1 {
	
	public static void main(String[] args) {
		SDInterface sd = new SDInterface();
		UsbInterface usb = new CardReader1(sd);
		usb.usbRead();
	}
}
