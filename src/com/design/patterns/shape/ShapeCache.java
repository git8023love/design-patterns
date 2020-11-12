package com.design.patterns.shape;

import java.util.Hashtable;

/**
 * 创建类，模拟从数据库获取实体类数据，并缓存
 */
public class ShapeCache {
	
	private static Hashtable<Integer, Shape> shapeMap = new Hashtable<Integer, Shape>();
	
	public static Shape getShape(Integer id) {
		Shape shape = shapeMap.get(id);
		return (Shape) shape.clone();
	} 
	
	public static Shape getShapeOri(Integer id) {
		Shape shape = shapeMap.get(id);
		return shape;
	}
	
	/**
	 * 模拟对数据库的查询，创建类的实例
	 */
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId(1);
		shapeMap.put(circle.getId(), circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setId(2);
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
