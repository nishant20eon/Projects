package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//		what is the use of @SpringBootApplication
public class PractiseApplication {
	private static final Logger logger= LoggerFactory.getLogger(PractiseApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(PractiseApplication.class, args);
//		what is springApplication.run

//  	2022-09-01 01:48:46.303 DEBUG 15372 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'practiseApplication'
//		2022-09-01 01:48:46.304 DEBUG 15372 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'demoController'

		logger.info("PractiseApplication is starting");
		DemoController demoController=new DemoController();
		// This object will store like a  noraml java or heap area

	}

}
