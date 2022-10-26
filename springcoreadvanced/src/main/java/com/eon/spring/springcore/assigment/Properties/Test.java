/* Create wsclient.properties which have three info. 
1) ur=xyz
2) userName=test
3) password=test

configure inside Spring configuration file then run it using test.java aplication

*/
package com.eon.spring.springcore.assigment.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/eon/spring/springcore/assigment/Properties/springConfig.xml");
		WsClient wsclient = (WsClient) context.getBean("wsclient");
		System.out.println(wsclient);

	}

}
