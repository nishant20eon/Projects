package com.eon.spring.springcoreadvanced.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	//Field level
	@Autowired(required=false)
	@Qualifier("address12")
	private Address address;

	
	
	/*
	 * public Address getAddress()
	 * { return address; }
	 * 
	 // Setter Level
	 * @Autowired 
	 * public void setAddress(Address address) 
	 *{ this.address = address; }
	 */

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}


// 
