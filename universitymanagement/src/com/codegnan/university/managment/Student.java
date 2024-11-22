package com.codegnan.university.managment;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> enrolledCourse;
	
	public Student(String name) {
		this.name=name;
		this.enrolledCourse= new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getEnrolledCourse() {
		return enrolledCourse;
	}

	public void setEnrolledCouses(List<Course> enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}

	@Override
	public String toString() {
		return name;
	}

	public void enrolledCourse(Course course) {
		// TODO Auto-generated method stub
		
	}
	
}
