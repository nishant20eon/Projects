package com.eon.spring.springcore.lc.assigment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		System.out.println("Inside setter method");
		this.status = status;
	}

	@Override
	public String toString() {
		return "TicketReservation [status=" + status + "]";
	}

	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize() ");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Inside Destroy()");
	}

}
