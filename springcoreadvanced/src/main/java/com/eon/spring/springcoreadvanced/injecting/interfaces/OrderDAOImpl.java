package com.eon.spring.springcoreadvanced.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside createOrder() for class OrderDAOImpl");

	}

}
