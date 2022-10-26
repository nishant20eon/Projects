package com.eon.spring.springcore.lc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Patient
	{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}
	
	@PostConstruct
	public void hi ()
	{
		System.out.println("Init() - Inside a Hi");
	}
	
	@PreDestroy
	public void bye()
	{
		System.out.println("Destroy() - Inside a Bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}	
	}
