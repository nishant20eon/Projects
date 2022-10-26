package com.eon.spring.springcoreadvanced.injecting.interfaces.annotation;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImpl which createOrder()");

	}

}
