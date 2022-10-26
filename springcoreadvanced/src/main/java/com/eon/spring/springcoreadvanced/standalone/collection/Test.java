package com.eon.spring.springcoreadvanced.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/eon/spring/springcoreadvanced/standalone/collection/config.xml");
		
		ProductList productslist = (ProductList) context.getBean("productslist");
		
		System.out.println(productslist);
	}

}
