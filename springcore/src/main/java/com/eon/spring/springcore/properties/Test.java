package com.eon.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext(
				"com/eon/spring/springcore/properties/properties.xml");
		CountriesandLanguages countrieslang = (CountriesandLanguages) context.getBean("countriesandlangs");
		System.out.println(countrieslang.toString());
		System.out.println(countrieslang.toString().getClass().getName());

	}

}
