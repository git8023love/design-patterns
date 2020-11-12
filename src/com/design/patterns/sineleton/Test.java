package com.design.patterns.sineleton;

public class Test {

	/**
	 * 单例（Singleton）模式：某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。
	 * 创建型模式的主要关注点是“怎样创建对象？”，它的主要特点是“将对象的创建与使用分离”。这样可以降低系统的耦合度，使用者不需要关注对象的创建细节，对象的创建由相关的工厂来完成。
	 * 单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
	 * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。

		    注意事项
		    1、单例类只能有一个实例
		    2、单例类必须自己创建自己的唯一实例
		    3、单例类必须给所有其他对象提供这一实例
		   实现方式
		   1、懒汉式，线程不安全
		   2、懒汉式，线程安全
		   3、饿汉式
		   4、双检锁/双重校验锁
		   5、登记式/静态内部类
		   5、枚举
	 * 
	 * 最佳单例模式
	 */
	public static void main(String[] args) {
		Singleton6.INSTANCE.doSomething();
	}
}