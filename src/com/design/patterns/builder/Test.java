package com.design.patterns.builder;

public class Test {
	
	/**
	 * 建造者（Builder）模式：将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。
	 * 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
	 * 一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
	 * 造者模式举例：去肯德基点餐，我们可以认为点餐就属于一个建造订单的过程。我们点餐的顺序是无关的，点什么东西也是没有要求的，可以单点，也可以点套餐，也可以套餐加单点，但是最后一定要点确认来完成订单。

		    建造者模式适用场景
		    1、需要生成的对象具有复杂的内部结构。
		    2、需要生成的对象内部属性本身相互依赖。
		    3、创建的对象较复杂，由多个部件构成，各部件面临着复杂的变化，但构件间的建造顺序是稳定的。
		    4、创建复杂对象的算法独立于该对象的组成部分以及它们的装配方式，即产品的构建过程和最终的表示是独立的。
		    5、初始化一个对象特别复杂，如使用多个构造方法，或者说有很多参数，并且都有默认值时。


		注意事项
		  为了灵活构造复杂对象，该对象会有多个成员变量，在外部调用的时候，不需要或者不方便一次性创建出所有的成员变量，在这种情况下，使用多个构造方法去构建对象，很难维护，
		这时候Builder设计模式解决这个问题，进行buid()方法中创建对象，并且将builder传入，该builder中，维护了传入对象的成员变量。
		  与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
		
		优缺点
		1、各个具体的建造者相互独立，有利于系统的扩展。
		2、客户端不必知道产品内部组成的细节，便于控制细节风险。
		3、产品的组成部分必须相同，这限制了其使用范围。
		4、如果产品的内部变化复杂，该模式会增加很多的建造者类。
		
		模式结构
		1、产品角色（Product）：它是包含多个组成部件的复杂对象，由具体建造者来创建其各个部件。
		2、抽象建造者（Builder）：它是一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法。
		3、具体建造者(Concrete Builder）：实现Builder接口，完成复杂产品的各个部件的具体创建方法。
		4、指挥者（Director）：它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息。

	 */
	public static void main(String[] args) {
		Builder builder = new MacBookBuilder();
		Director director = new Director(builder);
		director.construct("英特尔主板", "Retina显示器");
		Computer computer = builder.build();
		System.out.println(computer.toString());
		
		Builder huaWei = new HuaWeiBookBuilder();
		Director huaweiDirector = new Director(huaWei);
		huaweiDirector.construct("英特尔主板", "Retina显示器");
		Computer huaWeiComputer = huaWei.build();
		System.out.println(huaWeiComputer.toString());
		
	}

}
