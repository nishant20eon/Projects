package com.eon.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eon.spring.springjdbc.employee.dao.EmployeeDao;
import com.eon.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/eon/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		/*
		 * Employee employee = new Employee(); employee.setId(5);
		 * employee.setLastName("Khan"); employee.setFirstName("Salman"); // int result
		 * = dao.create(employee); //
		 * System.out.println("Number of records insterted are : "+ result); int result
		 * = dao.update(employee); System.out.println("Number of records updated are : "
		 * + result); //int result = dao.delete(5);
		 * //System.out.println("Number of records deleted are : " + result);
		 */		
		
		  //Employee employee1 = dao.read(2); System.out.println(employee1);
		 
		List<Employee> employee1 = dao.read();
		System.out.println(employee1);
	}

}
