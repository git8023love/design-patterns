package com.design.patterns.bridge;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		color.paint("方形");
	}

}
