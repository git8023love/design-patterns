package com.design.patterns.builder;

public class Director {
	Builder builder = null;
	
	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct(String board, String display) {
		builder.buildDisplay(display);
		builder.buildBoard(board);
		builder.buildOs();
	}
}
