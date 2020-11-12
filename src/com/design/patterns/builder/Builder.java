package com.design.patterns.builder;
public abstract class Builder {

	// 创建主板
	public abstract void buildBoard(String board);
	// 创建显示器
	public abstract void buildDisplay(String display);
	// 创建主系统
	public abstract void buildOs();
	// 创建电脑
	public abstract Computer build();
}