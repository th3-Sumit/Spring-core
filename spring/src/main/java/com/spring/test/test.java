package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/config.xml");

		Student student = context.getBean("st", Student.class);
				
		System.out.println(student);
  
	}
}
