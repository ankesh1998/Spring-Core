package com.spring.test.springcore.lifeCycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient{
	
	private int id;

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setter method");
		this.id = id;
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Inside hi method");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Inside bye method");
	}
	
	

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	
	
}
