package com.eon.spring.springcore.lc.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDestroy {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/eon/spring/springcore/lc/xmlconfig/config.xml");
		Patient patient = (Patient)context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();
	}

}

/*
 * we call destroy() method using context but appl. context doen't have register shutdown hook for this we call adstractappl. context
 * this is parent class of appl. context class
 *
 *1) setter get invoked after obj creation
 *2) init() called
 *3) use the obj in our program here we are printing patient
 *4) then it invoked destroy method
 *
 *ctrl+shift+o - arrange import
 */
