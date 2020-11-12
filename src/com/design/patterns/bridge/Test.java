package com.design.patterns.bridge;

public class Test {
	
	/**
	 * 桥接模式 : 将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
	 * 这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
	 * 这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。
	 * 桥接模式适用于以下场景
		1、当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时
		2、当一个系统不希望使用继承或因为多层次继承导致系统类的个数急剧增加时
		3、当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性时
		
		

		注意事项
		1、桥接模式实现了抽象化与实现化的脱耦。他们两个互相独立，不会影响到对方。
		2、对于两个独立变化的维度，使用桥接模式非常适合。
		
		优缺点
		1、分离抽象接口及其实现部分。提高了比继承更好的解决方案。
		2、桥接模式提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统。
		3、实现细节对客户透明，可以对用户隐藏实现细节。
		4、桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
		5、桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性。
		
		模式结构
		1、抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
		2、扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
		3、实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
		4、具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。

	 */
	public static void main(String[] args) {
		System.out.println();
		System.out.println("桥接模式");
		Shape shape = new Circle();
		shape.setColor(new RedColor());
		shape.draw();
		shape.setColor(new GreenColor());
		shape.draw();
		
		shape = new Rectangle();
		shape.setColor(new RedColor());
		shape.draw();
		shape.setColor(new GreenColor());
		shape.draw();
	}
}
