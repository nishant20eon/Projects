package com.eon.spring.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/eon/spring/springcoreadvanced/autowiring/config.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee) context.getBean("emp2");
		System.out.println(emp2);
		
		Employee emp3 = (Employee) context.getBean("emp3");
		System.out.println(emp3);
		
		
		

	}

}
