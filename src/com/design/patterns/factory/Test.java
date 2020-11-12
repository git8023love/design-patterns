package com.design.patterns.factory;

public class Test {

	/**
	 * 工厂模式
	 */
	public static void main(String[] args) {
		/**
		 * 工厂（Factory）模式：定义一个用于创建产品的接口，由子类决定生产什么产品
		 * 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
		 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。

			    工厂模式适用于以下场景
			    1、客户只知道创建产品的工厂名，而不知道具体的产品名。
			    2、创建对象的任务由多个具体子工厂中的某一个完成，而抽象工厂只提供创建产品的接口。
			    3、客户不关心创建产品的细节，只关心产品的品牌。

			优缺点
			1、一个调用者想创建一个对象，只要知道其名称就可以了。
			2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
			3、屏蔽产品的具体实现，调用者只关心产品的接口。
			4、每次增加一个产品时，都需要增加一个具体类和对象实现工厂，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。
			
			模式结构
			1、抽象工厂（Abstract Factory）：创建产品的接口，调用者通过它访问具体工厂的工厂方法来创建产品。
			2、具体工厂（ConcreteFactory）：实现抽象工厂中的抽象方法，完成具体产品的创建。
			3、抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
			4、具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。

		 * 
		 */
		System.out.println();
		System.out.println("工厂");
		PeopleFactory factory = new PeopleFactory();
		People people = factory.getPeople("Student");
		people.skill();
		
		/**
		 * 抽象工厂（Abstract Factory）模式：提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。
		 * 抽象工厂模式（Abstract Factory）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

  			在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。

			    抽象工厂模式适用于以下场景
			    1、需要创建的对象是一系列相互关联或相互依赖的产品族时
			    2、系统中有多个产品族，但每次只使用其中的某一族产品
			    3、系统中提供了产品的类库，且所有产品的接口相同，客户端不依赖产品实例的创建细节和内部结构
			   
		优缺点
		1、可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理
		2、当增加一个新的产品族时不需要修改原代码，满足开闭原则
		3、当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改
		
		模式结构
		1、抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法，可以创建多个不同等级的产品。
		2、具体工厂（Concrete Factory）：实现抽象工厂中的多个抽象方法，完成具体产品的创建。
		3、抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
		4、具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。

		 */
		System.out.println();
		System.out.println("抽象工厂");
		AbstractFactory peopleFactory = new PeopleFactory();
		People people1 = peopleFactory.getPeople("Teacher");
		people1.skill();

		AbstractFactory languageFactory = new LanguageFactory();
		Language language = languageFactory.getLanguage("Chinese");
		language.speak();
	}
}
