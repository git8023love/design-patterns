package com.design.patterns.template;

public class Test {
	
	/**
	 * 模板模式 : 定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。它是一种类行为型模式。
	 * 
	 * 在模板模式中，一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
	 * 模板模式适用场景
		1、有多个子类共有的方法，且逻辑相同。
		2、重要的、复杂的方法，可以考虑作为模板方法。
		
		
		注意事项
		为防止恶意操作，一般模板方法都加上 final 关键词。
		
		优缺点
		1、封装不变部分，扩展可变部分
		2、提取公共代码，便于维护
		3、行为由父类控制，子类实现
		4、每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大
		5、反向的控制结构，提高了代码阅读的难度
		
		模式结构
		1、抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
		2、具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤
	 */
	public static void main(String[] args) {
		Template template = new OpenAccount();
        template.process();
        System.out.println();
        
        template = new Deposit();
        template.process();
	}

}
