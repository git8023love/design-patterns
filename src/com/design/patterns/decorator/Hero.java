package com.design.patterns.decorator;

public class Hero implements People {

	@Override
	public void init() {
		System.out.println("初始化战士，无技能！");
	}

}
