package com.design.patterns.shape;
/**
 * 方形
 */
public class Rectangle extends Shape {

	public Rectangle() {
		super("This is a Rectangle.");
	}

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}