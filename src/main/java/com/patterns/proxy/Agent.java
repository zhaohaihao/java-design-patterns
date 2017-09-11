package com.patterns.proxy;
/**
 * 代理对象(Proxy)
 * @author bigsea
 * @date 2017-09-11 下午4:39:27
 */
public class Agent implements Station {
	
	private RealStation realStation;
	
	private String start;
	
	private String end;
	
	public Agent(String start, String end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void buy() {
		System.out.println("===== 开始执行代理对象方法 =====");
		if (realStation == null) {
			realStation = new RealStation(start, end);
		}
		realStation.buy();
	}

}
