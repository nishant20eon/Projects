package com.eon.spring.springcore.ConstructorInje.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/eon/spring/springcore/ConstructorInje/ambiguity/config.xml");
		Addtion addtion = (Addtion) context.getBean("addtion");
		System.out.println(addtion);
	}

}


// giving o/p in random behaviour 
