package com.patterns.proxy;
/**
 * 被代理对象(RealSubject)
 * @author bigsea
 * @date 2017-09-11 下午4:32:05
 */
public class RealStation implements Station {
	
	private String start;
	
	private String end;
	
	public RealStation(String start, String end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void buy() {
		System.out.println("===== 开始执行被代理对象方法 =====");
		System.out.println("买了一张从 " + start + " 到 " + end + " 的火车票");
	}

}
