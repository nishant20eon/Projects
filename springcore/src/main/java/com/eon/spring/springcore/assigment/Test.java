package com.eon.spring.springcore.assigment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/eon/spring/springcore/assigment/shoppingconfig.xml");
		ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(shoppingcart);

	}

}
