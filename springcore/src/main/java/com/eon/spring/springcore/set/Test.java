package com.eon.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/eon/spring/springcore/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) context.getBean("cardealer");
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
		System.out.println(cardealer.getModels().getClass().getName());

	}

}

//context.getBean(name of bean from XML file);
