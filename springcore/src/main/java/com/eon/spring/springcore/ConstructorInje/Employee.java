package com.eon.spring.springcore.ConstructorInje;

public class Employee {

	private int id;
	private Address address;

	public Employee(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

}
