package com.spring.Autowiring.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	private List<String> course; 

	public int getId() {
		return id;
	}

	public List<String> getCourse() {
		return course;
	}
	@Value("#{ls}")
	public void setCourse(List<String> course) {
		this.course = course;
	}

	@Value("23")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Value("Sumit Singh")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

}
