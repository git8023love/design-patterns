package com.design.patterns.builder;
public class MacBook extends Computer {

	protected MacBook() {
	}

	@Override
	public void setOs() {
		os = "Mac OS X 13";
	}
}