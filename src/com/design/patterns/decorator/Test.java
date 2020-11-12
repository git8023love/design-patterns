package com.design.patterns.decorator;

public class Test {

	/**
	 * 装饰器模式：动态的给对象增加一些职责，即增加其额外的功能。
	 * 这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
	 * 在现实生活中，常常需要对现有产品增加新的功能或美化其外观，如房子装修、相片加相框等。在软件开发过程中，有时想用一些现存的组件。这些组件可能只是完成了一些核心功能。
	 * 但在不改变其结构的情况下，可以动态地扩展其功能。所有这些都可以釆用装饰模式来实现。

  		这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。

  		通常情况下，扩展一个类的功能会使用继承方式来实现。但继承具有静态特征，耦合度高，并且随着扩展功能的增多，子类会很膨胀。
		如果使用组合关系来创建一个包装对象（即装饰对象）来包裹真实对象，并在保持真实对象的类结构不变的前提下，为其提供额外的功能，这就是装饰模式的目标。

		    装饰模式的应用场景
		    1、当需要给一个现有类添加附加职责，而又不能采用生成子类的方法进行扩充时。
		    2、当需要通过对现有的一组基本功能进行排列组合而产生非常多的功能时，采用继承关系很难实现，而采用装饰模式却很好实现。
		    3、当对象的功能要求可以动态地添加，也可以再动态地撤销时。
		    
		注意事项
		可代替继承。
		
		优缺点
		1、采用装饰模式扩展对象的功能比采用继承方式更加灵活。
		2、可以设计出多个不同的具体装饰类，创造出多个不同行为的组合。
		3、装饰类和被装饰类可以独立发展，不会相互耦合。
		4、装饰模式是继承的一个替代模式。
		5、装饰模式可以动态扩展一个实现类的功能。
		6、装饰模式增加了许多子类，如果过度使用会使程序变得很复杂。
		
		模式结构
		1、抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
		2、具体构件（Concrete Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
		3、抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
		4、具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。

	 */
	public static void main(String[] args) {
		People people = new Hero();
		people.init();
		
		System.out.println();
		SkillDecorator skillDecorator = new WanJianSkill(people);
		skillDecorator.init();
		
		System.out.println();
		SkillDecorator skillDecorator2 = new WuLeiSkill(people);
		skillDecorator2.init();
		
		System.out.println();
		SkillDecorator skillDecorator3 = new WanJianSkill(skillDecorator2);
		skillDecorator3.init();
	}
}
