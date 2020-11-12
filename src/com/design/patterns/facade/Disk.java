package com.design.patterns.facade;

public class Disk implements Computer {

    @Override
    public void start() {
        System.out.println("start disk.");
    }
}