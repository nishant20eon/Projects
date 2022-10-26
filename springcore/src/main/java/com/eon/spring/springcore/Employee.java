package com.eon.spring.springcore;

public class Employee {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

/* Steps to create DI
 * 1) Create the POJO i.e. Bean and here Employee.java is employee bean
 * 2) Create the configuration file. (Config.xml)
 * 3)Create a test class
 */
