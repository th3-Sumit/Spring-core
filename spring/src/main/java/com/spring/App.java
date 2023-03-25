package com.spring;

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
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/config.xml");
        Rohit rohit = context.getBean("person", Rohit.class);
        
        rohit.eat();
        rohit.sleep();
        
//        System.out.println(context);
    }
}
