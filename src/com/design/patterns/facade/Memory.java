package com.design.patterns.facade;

public class Memory implements Computer {

    @Override
    public void start() {
        System.out.println("start memory.");
    }
}