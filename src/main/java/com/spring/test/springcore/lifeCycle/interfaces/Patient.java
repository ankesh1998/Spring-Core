package com.spring.test.springcore.lifeCycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {
	
	private int id;

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setter method");
		this.id = id;
	}
	
	
	

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Inside afterPropertiesSet");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy");
	}
	
}
