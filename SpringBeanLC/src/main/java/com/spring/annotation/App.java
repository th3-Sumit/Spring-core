package com.spring.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/annotation/config.xml");
		context.registerShutdownHook();
		
		Student s1 = context.getBean("st", Student.class);
		System.out.println(s1);
		
		
	}
}
