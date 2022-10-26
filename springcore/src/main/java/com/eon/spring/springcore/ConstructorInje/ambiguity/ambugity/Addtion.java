package com.eon.spring.springcore.ConstructorInje.ambiguity.ambugity;

public class Addtion {
	
	Addtion(int a, double b)
	{
		System.out.println("Inside Constructor");
		System.out.println(a);
		System.out.println(b);
	}
	
	Addtion(double a, int b)
	{
		System.out.println("Inside Constructor");
		System.out.println(a);
		System.out.println(b);
	}
	

}
