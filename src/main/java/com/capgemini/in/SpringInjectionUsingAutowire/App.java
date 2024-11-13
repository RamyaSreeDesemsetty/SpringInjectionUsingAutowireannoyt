package com.capgemini.in.SpringInjectionUsingAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.scan("com.capgemini.in.SpringInjectionUsingAutowire");
		ac.refresh();
    	Human hm = ac.getBean(Human.class);
    	hm.alive();
    	Animal ani = ac.getBean(Animal.class);
    	ani.AnimalAlive();      	
    }
}
