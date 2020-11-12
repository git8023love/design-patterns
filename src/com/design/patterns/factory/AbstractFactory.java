package com.design.patterns.factory;

public abstract class AbstractFactory {

	public abstract People getPeople(String people);

	public abstract Language getLanguage(String language);
}