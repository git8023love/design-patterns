package com.design.patterns.template;
/**
 * 开户业务
 */
public class OpenAccount extends Template {

	@Override
	public void evaluation() {
		System.out.println("你的评价是：优");
	}

	@Override
	public void handle() {
		System.out.println("办理业务中：开户业务");
	}
	
}
