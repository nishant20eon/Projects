package com.eon.spring.springcore.lc.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/eon/spring/springcore/lc/annotation/config.xml");
		Patient patient = (Patient)context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();
	}

}


//Life Cycle method contain - Init() and Destroy()
//
//Init() invoked just after object creation and invoke Destroy() before object is cleaned up and destroy.
//3 Ways to call
//1) XML configration
//  a) Init() {Syntax init-method}   - Inside init() write  databse connection. connection web services
//  b) Destroy() {Syntax Dsetroy-method} - Inside cleanup code

//@PostConstruct - enable init()
//@PreDestroy - enable destroy()
//
//
//To enable all annotation we need to use -
//<context:annotation-config/>
