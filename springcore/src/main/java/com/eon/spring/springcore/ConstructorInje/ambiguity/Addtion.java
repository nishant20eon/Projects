package com.eon.spring.springcore.ConstructorInje.ambiguity;

public class Addtion {

	
	  Addtion(double a, double b) {
	  System.out.println("Inside constructor double "); }
	 

	Addtion(int a, int b) {
		System.out.println("Inside constructor INT");
	}
	Addtion(int a,double b) {
		System.out.println("Inside constructor mix");
	}

	Addtion(String a, String b) {
		System.out.println("Inside constructor String");
	}

}
