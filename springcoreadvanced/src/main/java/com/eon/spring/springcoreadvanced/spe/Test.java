package com.eon.spring.springcoreadvanced.spe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/eon/spring/springcoreadvanced/spe/config.xml");
		Expression expression = (Expression) context.getBean("expression");
		System.out.println(expression);

	}

}
