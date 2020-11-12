package com.design.patterns.decorator;

public class WuLeiSkill extends SkillDecorator {

    public WuLeiSkill(People people) {
        super(people);
    }

    @Override
    public void init() {
        super.init();
        setSkill();
    }

    private void setSkill() {
        System.out.println("获得技能：五雷轰顶！");
    }
}