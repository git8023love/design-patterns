package com.design.patterns.facade;

public class FacadeDemo {
	private Cpu cpu;
    private Memory memory;
    private Disk disk;
    
    public FacadeDemo() {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void startCpu() {
        cpu.start();
    }

    public void startMemory() {
        memory.start();
    }

    public void startDisk() {
        disk.start();
    }
}
