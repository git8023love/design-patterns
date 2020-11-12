package com.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class University {
	private String name;
    private List<University> colleges;
    
    public University(String name) {
        this.name = name;
        colleges = new ArrayList<University>();
    }

    public void add(University university) {
        colleges.add(university);
    }

    public void remove(University university) {
        colleges.remove(university);
    }

    public List<University> getColleges() {
        return colleges;
    }

    @Override
    public String toString() {
        return "NAME: -> " + name;
    }
}
