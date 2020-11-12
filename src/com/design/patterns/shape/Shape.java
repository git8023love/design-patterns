package com.design.patterns.shape;
/**
 * 形状抽象类
 */
public abstract class Shape implements Cloneable {

	public Shape(String type) {
		this.type = type;
	}

	private Integer id;

	// 类型
	protected String type;

	// 绘制图制
	abstract void draw();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
}
