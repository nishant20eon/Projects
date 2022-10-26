package com.eon.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean
	{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}
	
	public void hi ()
	{
		System.out.println("Init() - Inside a Hi");
	}
	
	public void bye()
	{
		System.out.println("Destroy() - Inside a Bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	//act as init()
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside afterpropertiesSet()");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside Destroy()");
		
	}
}


/* 2nd way to call init and destroy()*/
