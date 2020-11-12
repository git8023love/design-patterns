package com.design.patterns.flyweight;

public class Test {

	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	
	// 享元模式
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; ++i) {
            Circle circle = Factory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomX() {
		 return (int) (Math.random() * 100);
	}

	private static String getRandomColor() {
		int index = (int) (Math.random() * colors.length);
		System.out.println(index);
		return colors[index];
	}
}
