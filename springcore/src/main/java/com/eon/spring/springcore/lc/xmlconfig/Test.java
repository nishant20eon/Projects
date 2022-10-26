package com.eon.spring.springcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eon.spring.springcore.reftypes.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/eon/spring/springcore/lc/xmlconfig/config.xml");
		Patient patient = (Patient)context.getBean("patient");
		System.out.println(patient);
	}

}

/*
As soon as 
obj is created and setter method invoked values, init() started after that it will execute rest code or print

To call destroy method we need to enable pre distruction hook
*/
