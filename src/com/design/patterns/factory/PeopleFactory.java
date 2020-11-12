package com.design.patterns.factory;
public class PeopleFactory extends AbstractFactory{

	public People getPeople(String className) {
		if (className.equals(Student.class.getSimpleName())) {
			return new Student();
		} else if (className.equals(Teacher.class.getSimpleName())) {
			return new Teacher();
		}
		return null;

	}

	@Override
	public Language getLanguage(String language) {
		// TODO Auto-generated method stub
		return null;
	}
}