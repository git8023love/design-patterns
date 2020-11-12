package com.design.patterns.decorator;

public abstract class SkillDecorator implements People {
	
	private People people;
	
	public SkillDecorator(People people) {
        this.people = people;
    }

	@Override
	public void init() {
		people.init();
	}

}
