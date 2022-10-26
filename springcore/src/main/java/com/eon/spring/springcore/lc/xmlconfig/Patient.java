package com.eon.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}
	
	//Act as init()
	public void hi ()
	{
		System.out.println("Init() - Inside a Hi");
	}
	
	//Act as destroy()
	public void bye()
	{
		System.out.println("Destroy() - Inside a Bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
