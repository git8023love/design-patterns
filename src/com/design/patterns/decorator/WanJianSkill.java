package com.design.patterns.decorator;

public class WanJianSkill extends SkillDecorator {

	public WanJianSkill(People people) {
		super(people);
	}
	
	@Override
	public void init() {
		super.init();
		setSkill();
	}
	
	private void setSkill() {
        System.out.println("获得技能：万箭齐发！");
    }
	
}