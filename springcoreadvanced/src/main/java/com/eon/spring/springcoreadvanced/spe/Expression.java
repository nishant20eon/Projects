package com.eon.spring.springcoreadvanced.spe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Expression {

	@Value("#{66*24}")
	private int total;

	@Value("#{-99}")
	private int empId;

	/*
	 * Syntax to use static method - T(class).method(param) { T is showning SPE }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Value("#{T(java.lang.Math).abs(-99)}")
	private int empId1;

	@Value("#{new Integer(88)}")
	private int empId2;

	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int MinValue;

	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int MaxValue;

	@Value("#{'Nishant'.toUpperCase()}")
	private String name;

	@Value("#{2+4>5}")
	private boolean active;

	@Value("#{2+2>5?true:false}")
	private boolean active1;

	public boolean isActive1() {
		return active1;
	}

	public void setActive1(boolean active1) {
		this.active1 = active1;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getMinValue() {
		return MinValue;
	}

	public void setMinValue(int minValue) {
		MinValue = minValue;
	}

	public int getMaxValue() {
		return MaxValue;
	}

	public void setMaxValue(int maxValue) {
		MaxValue = maxValue;
	}

	public int getEmpId2() {
		return empId2;
	}

	public void setEmpId2(int empId2) {
		this.empId2 = empId2;
	}

	public int getEmpId1() {
		return empId1;
	}

	public void setEmpId1(int empId1) {
		this.empId1 = empId1;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Expression [total=" + total + ", empId=" + empId + ", empId1=" + empId1 + ", empId2=" + empId2
				+ ", MinValue=" + MinValue + ", MaxValue=" + MaxValue + ", name=" + name + ", active=" + active
				+ ", active1=" + active1 + "]";
	}

}
