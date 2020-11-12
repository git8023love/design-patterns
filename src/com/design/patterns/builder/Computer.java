package com.design.patterns.builder;

public abstract class Computer {
	// 主板
	protected String board;
	// 显示器
	protected String display;
	// 操作系统
	protected String os;
	
	protected Computer() {
	}
	
	public void setBoard(String board) {
		this.board = board;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public abstract void setOs();

	@Override
	public String toString() {
		return "主板型号：" + board + ", 显示器型号：" + display + ", 操作系统：" + os;
	}
}
