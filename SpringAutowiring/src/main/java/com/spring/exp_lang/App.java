package com.spring.exp_lang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/exp_lang/config.xml");
		Student st = context.getBean("student", Student.class);
		System.out.println(st);
	}
}
