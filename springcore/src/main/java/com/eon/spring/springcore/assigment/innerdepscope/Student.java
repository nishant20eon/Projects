package com.eon.spring.springcore.assigment.innerdepscope;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String st_Id;
	private String st_Name;
	private String st_Loc;

	public String getSt_Id() {
		return st_Id;
	}

	@Required
	public void setSt_Id(String st_Id) {
		this.st_Id = st_Id;
	}

	public String getSt_Name() {
		return st_Name;
	}

	public void setSt_Name(String st_Name) {
		this.st_Name = st_Name;
	}

	public String getSt_Loc() {
		return st_Loc;
	}

	public void setSt_Loc(String st_Loc) {
		this.st_Loc = st_Loc;
	}

	@Override
	public String toString() {
		return "Student [st_Id=" + st_Id + ", st_Name=" + st_Name + ", st_Loc=" + st_Loc + "]";
	}
	
	

}
