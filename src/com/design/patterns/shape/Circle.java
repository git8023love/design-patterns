package com.design.patterns.shape;
/**
 * 圆形
 */
public class Circle extends Shape {

	public Circle() {
		super("This is a Circle.");
	}

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}
}