package com.codegnan.university.managment;

import java.util.ArrayList;
import java.util.List;
public class Professor {
	private String name;
	private List<Course> assignedCourse;
	
	public Professor(String name) {
		this.name= name;
		this.assignedCourse = new ArrayList<>();
	}
	public void assignCourse(Course course) {
		if(!assignedCourse.contains(course)) {
			assignedCourse.add(course);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getAssignedCourse() {
		return assignedCourse;
	}
	public void setAssignedCourse(List<Course> assignedCourse) {
		this.assignedCourse = assignedCourse;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
