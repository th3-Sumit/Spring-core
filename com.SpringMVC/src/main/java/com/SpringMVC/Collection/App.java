package com.SpringMVC.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringMVC/Collection/config.xml");
		Students students = context.getBean("st1", Students.class);
		
		System.out.println(students);
	}
}
