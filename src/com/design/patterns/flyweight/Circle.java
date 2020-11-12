package com.design.patterns.flyweight;

public class Circle implements Shape {
	
	private String color;
    private int x;
    private int y;
    private int radius;
    
    public Circle(String color) {
        super();
        this.color = color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形-> 长：" + x + "，宽：" + y + "，半径：" + radius + "，颜色：" + color);
    }
	
}