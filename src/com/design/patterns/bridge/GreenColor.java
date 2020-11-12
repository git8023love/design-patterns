package com.design.patterns.bridge;

public class GreenColor implements Color {

    @Override
    public void paint(String shape) {
        System.out.println("绿色的 -> " + shape);
    }
}