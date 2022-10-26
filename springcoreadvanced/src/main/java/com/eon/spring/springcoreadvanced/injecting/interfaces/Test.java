package com.eon.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com./eon/spring/springcoreadvanced/injecting/interfaces/config.xml");
		
		OrderBO bo = (OrderBO) context.getBean("boimpl");
		bo.placeOrder();

	}

}
