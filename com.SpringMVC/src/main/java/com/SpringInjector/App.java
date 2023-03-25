package com.SpringInjector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringInjector/config.xml");
		Students student1 = context.getBean("st1", Students.class);
		Students student2 = context.getBean("st2", Students.class);
		
		System.out.println(student1);
		System.out.println(student2);
		
		
	}

}
