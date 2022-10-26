package com.eon.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext appln = new ClassPathXmlApplicationContext("com/eon/spring/springcore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) appln.getBean("prescription");
		System.out.println(prescription);
		
		

	}

}
