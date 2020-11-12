package com.design.patterns.factory;

public class LanguageFactory extends AbstractFactory {

	@Override
	public People getPeople(String people) {
		return null;
	}

	@Override
	public Language getLanguage(String language) {
		if (language.equals(Chinese.class.getSimpleName())) {
			return new Chinese();
		} else if (language.equals(English.class.getSimpleName())) {
			return new English();
		}

		return null;
	}
}