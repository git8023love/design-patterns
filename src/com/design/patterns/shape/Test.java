package com.design.patterns.shape;

public class Test {

	/**
	 * 原型（Prototype）模式：将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。
	 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
	 * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。
	 * 我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。
	 *
	 *原型模式通常适用于以下场景
		1、对象之间相同或相似，即只是个别的几个属性不同的时候。
		2、对象的创建过程比较麻烦，但复制比较简单的时候。
		3、资源优化、性能和安全要求的场景。
		4、类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。
		5、产生一个对象需要非常繁琐的数据准备或访问权限。
		6、一个对象多个修改者的场景。
		7、一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时。
		
		

		注意事项
		  与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。浅拷贝实现Cloneable，重写，深拷贝是通过实现Serializable读取二进制流。
		
		优缺点
		1、性能提高。
		2、逃避构造函数的约束。
		3、必须实现Cloneable接口。
		
		模式结构
		1、抽象原型类：规定了具体原型对象必须实现的接口。
		2、具体原型类：实现抽象原型类的clone()方法，它是可被复制的对象。
		3、访问类：使用具体原型类中的clone()方法来复制新的对象。

	 */
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape shape1 = ShapeCache.getShape(1);
		System.out.println(shape1.getType());
		// clone实例比较
		System.out.println(ShapeCache.getShape(1) == ShapeCache.getShape(1));
		// 原始实例比较
		System.out.println(ShapeCache.getShapeOri(1) == ShapeCache.getShapeOri(1));
		
		System.out.println();
		// 实例2
		Shape shape2 = ShapeCache.getShape(2);
		System.out.println(shape2.getType());
		
		// clone实例比较
		System.out.println(ShapeCache.getShape(2) == ShapeCache.getShape(2));
		// 原始实例比较
		System.out.println(ShapeCache.getShapeOri(2) == ShapeCache.getShapeOri(2));
		
	}
}
