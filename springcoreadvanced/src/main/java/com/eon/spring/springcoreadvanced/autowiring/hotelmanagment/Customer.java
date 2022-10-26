package com.eon.spring.springcoreadvanced.autowiring.hotelmanagment;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String customerName;
	
	@Autowired
	private Reservation reservation;
	
	

	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", reservation=" + reservation + "]";
	}

}
