package com.design.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	
	private static final Map<String, Circle> circleMap = new HashMap<String, Circle>();
	
	public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("-> 绘制 " + color + " 颜色的圆形");
        }
        return circle;
    }

}
