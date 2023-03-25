package com.example.com.SpringMVC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Action ac = new Ram();
//        ac.eat();
//        ac.sleep();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	Ram ram = context.getBean("person", Ram.class);
    	Shyam shyam = context.getBean("person2", Shyam.class);
    	
    	ram.eat();
    	ram.sleep();
    	
    	shyam.eat();
    	shyam.sleep();
    	
    	
    }
}
