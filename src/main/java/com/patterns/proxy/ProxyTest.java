package com.patterns.proxy;
/**
 * 代理测试类
 * @author bigsea
 * @date 2017-09-11 下午4:46:24
 */
public class ProxyTest {
	
	public static void main(String[] args) {
		Station station = new Agent("诸暨", "杭州");
		
		station.buy();
	}
}
