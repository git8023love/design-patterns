package com.design.patterns.builder;

public class MacBookBuilder extends Builder {

	private Computer computer = new MacBook();
	
	@Override
	public Computer build() {
		return computer;
	}

	@Override
	public void buildBoard(String board) {
		computer.setBoard(board);
	}

	@Override
	public void buildDisplay(String display) {
		computer.setDisplay(display);
	}

	@Override
	public void buildOs() {
		computer.setOs();
	}

}
