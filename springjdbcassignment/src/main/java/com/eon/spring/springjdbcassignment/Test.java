package com.eon.spring.springjdbcassignment;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eon.spring.springjdbcassignment.dao.PassengerDao;
import com.eon.spring.springjdbcassignment.dto.Passenger;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		PassengerDao passdaoimpl = (PassengerDao) context.getBean("passdaoimpl");
												/*Curd Opration*/
		
//		System.out.println("Insert content into a table");
//		Passenger p1=new Passenger();
//		p1.setId(78);
//		p1.setFirstName("Dwayne");
//		p1.setLastName("Johnson");
//		int result = passdaoimpl.create(p1);
//		System.out.println(result +" Records inserted into a table");
//		
//		Passenger p2=new Passenger();
//		p2.setId(75);
//		p2.setFirstName("Vin");
//		p2.setLastName("Diesel");
//		int result1 = passdaoimpl.create(p2);
//		System.out.println(result+1 +" Records inserted into a table");
		
//		System.out.println("Update content into a table");
//		
//		Passenger p=new Passenger();
//		p.setId(10);
//		p.setFirstName("Govinda");
//		int result = passdaoimpl.update(p);
//		System.out.println(result +" Record updated into a table");
		
//		System.out.println("Deleting content of a table");
//		Passenger p=new Passenger();
//		Scanner scn=new Scanner(System.in);
//		System.out.println("Enter ID which need to be deleted");
//		int id=scn.nextInt();
//		int result = passdaoimpl.delete(id);
//		System.out.println(result + " Records deleted from table");
		
//		Scanner scn=new Scanner(System.in);
//		System.out.println("Enter ID which need to be read");
//		int id=scn.nextInt();
//		Passenger passenger = passdaoimpl.read(id);
//		System.out.println(passenger);	
		
		List<Passenger> passenger = passdaoimpl.read();
		System.out.println(passenger);	
		
		
	}

}
