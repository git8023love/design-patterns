package com.design.patterns.template;

/**
 * 存款业务
 */
public class Deposit extends Template {

	@Override
	public void evaluation() {
		 System.out.println("你的评价是：好");
	}

	@Override
	public void handle() {
		System.out.println("办理业务中：存款业务");
	}
	
}