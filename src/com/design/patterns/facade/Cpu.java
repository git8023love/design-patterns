package com.design.patterns.facade;

public class Cpu implements Computer {

    @Override
    public void start() {
        System.out.println("start cpu.");
    }
}