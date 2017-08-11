package com.patterns.builder;
/**
 * @author bigsea
 * @date 2017-08-11 上午9:04:12
 * 抽象建造者类 Builder
 */
public interface Builder {
	void buildProcessor();
    void buildMemory();
    void buildStorage();
    void buildBar();
    MacPro getResult();
}
