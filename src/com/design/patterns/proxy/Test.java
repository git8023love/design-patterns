package com.design.patterns.proxy;

public class Test {

	/**
	 * 代理（Proxy）模式：为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。
	 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
	 * 在代理模式中，创建具有现有对象的对象，以便向外界提供功能接口。
	 * 
	 * 由于某些原因需要给某对象提供一个代理以控制对该对象的访问。这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。

		    代理模式的应用场景
		    1、远程代理。
		    2、虚拟代理。
		    3、Copy-on-Write 代理。
		    4、保护（Protect or Access）代理。
		    5、Cache代理。
		    6、防火墙（Firewall）代理。
		    7、同步化（Synchronization）代理。
		    8、智能引用（Smart Reference）代理。


		注意事项
		  代理模式有静态代理和动态代理，动态代理有基于JDK和CGLIB两种实现方式。本文介绍的是静态代理模式，动态代理本站后续会再作介绍。
		
		优缺点
		1、职责清晰
		2、高扩展性
		3、智能化
		4、代理模式在客户端与目标对象之间起到一个中介作用和保护目标对象的作用
		5、代理对象可以扩展目标对象的功能
		6、代理模式能将客户端与目标对象分离，在一定程度上降低了系统的耦合度
		7、在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢
		8、增加了系统的复杂度
		
		模式结构
		1、抽象主题（Subject）类：通过接口或抽象类声明真实主题和代理对象实现的业务方法。
		2、真实主题（Real Subject）类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
		3、代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。

	 */
	public static void main(String[] args) {
		Image image = new ProxyImage("pic.jpg");
		image.display();
	}
}
