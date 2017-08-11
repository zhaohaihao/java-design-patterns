package com.patterns.builder;
/**
 * @author bigsea
 * @date 2017-08-11 上午9:06:25
 * 指挥者类 Director
 */
public class Director {
	public void construct(Builder builder) {
        builder.buildProcessor();
        builder.buildMemory();
        builder.buildStorage();
        builder.buildBar();
    }
}
