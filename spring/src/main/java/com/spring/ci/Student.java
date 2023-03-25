package com.spring.ci;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private String address;
	
	private List<String> courseList;
	
	private Certificate certificate;
	
	
	public Student(int id, String name, String address, List<String> courseList, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.courseList = courseList;
		this.certificate = certificate;
	}

	public Student(String name, int id) {
		System.out.println("String , int constructor calling ....");
		this.id = id;
		this.name = name;
		
	}

	public Student(int id, String name) {
		System.out.println("int , string constructor calling.....");
		this.id = id;
		this.name = name;

	}



	public Student(String name, String add) {
		System.out.println("String , String constructor calling .....");
		this.address = add;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", courseList=" + courseList
				+ ", certificate=" + certificate + "]";
	}
}
