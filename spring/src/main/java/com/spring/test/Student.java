package com.spring.test;

import java.util.List;
import java.util.Map;

public class Student {
	private int id;
	private String name;
	private List<String> course;
	private CourseFee coursefee;
	
	public Student(int id, String name, List<String> course, CourseFee coursefee) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.coursefee = coursefee;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", coursefee=" + coursefee + "]";
	}
	
	
}
