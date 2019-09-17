package com.spring.test.springcore.constructorInjection.ambiguity;

public class Addition {
	
	public Addition(int a,int b) {
		System.out.println("Inside contructor INT");
	}
	public Addition(Double a,Double b) {
		System.out.println("Inside contructor DOUBLE");
	}
	public Addition(String a,String b) {
		System.out.println("Inside contructor STRING");
	}

}
