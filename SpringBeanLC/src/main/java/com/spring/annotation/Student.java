package com.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@PostConstruct
	public void init() throws Exception {
		System.out.println("Initializing object ");
		
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Destroy object ");
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
