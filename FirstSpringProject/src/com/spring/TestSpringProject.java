package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        Restaurant restaruantObj = (Restaurant)    context.getBean("restaurantBean");
        restaruantObj.greetCustomer();
	}

}
