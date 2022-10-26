package com.eon.spring.springcore.ConstructorInje.cschema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/eon/spring/springcore/ConstructorInje/cschema/config.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println(e);
	}

}
