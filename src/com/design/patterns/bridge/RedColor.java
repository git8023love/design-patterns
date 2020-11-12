package com.design.patterns.bridge;

public class RedColor implements Color {

	@Override
	public void paint(String shape) {
		System.out.println("红色的 -> " + shape);
	}

}
