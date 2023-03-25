package com.spring.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements DisposableBean, InitializingBean{
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
	
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing object ");
		
	}
	public void destroy() throws Exception {
		System.out.println("Destroy object ");
		
	}
}
