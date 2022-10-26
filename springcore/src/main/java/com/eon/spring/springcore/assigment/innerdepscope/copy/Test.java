package com.eon.spring.springcore.assigment.innerdepscope.copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/eon/spring/springcore/assigment/innerdepscope/config.xml");
		University university = (University) context.getBean("university");
		
		System.out.println(university);
		System.out.println("Hascode value = "+ university.hashCode());
		
		
		University university1 = (University) context.getBean("university");
		
		System.out.println(university1);
		System.out.println("Hascode value = "+ university1.hashCode());
		
		

	}

}
