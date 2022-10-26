package com.eon.spring.springcore.assigment.innerdepscope;

import org.springframework.beans.factory.annotation.Required;

public class University {
	private int clg_id;
	private String clg_name;
	private Student st_home;

	public int getClg_id() {
		return clg_id;
	}
	
	@Required
	public void setClg_id(int clg_id) {
		this.clg_id = clg_id;
	}

	public String getClg_name() {
		return clg_name;
	}

	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}

	public Student getSt_home() {
		return st_home;
	}

	public void setSt_home(Student st_home) {
		this.st_home = st_home;
	}

	@Override
	public String toString() {
		return "University [clg_id=" + clg_id + ", clg_name=" + clg_name + ", st_home=" + st_home + "]";
	}
	
	

}
