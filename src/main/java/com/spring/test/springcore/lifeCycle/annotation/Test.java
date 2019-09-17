package com.spring.test.springcore.lifeCycle.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext abc = new ClassPathXmlApplicationContext("com/spring/test/springcore/lifeCycle/annotation/config.xml");
		 Patient patient = (Patient) abc.getBean("patient");
		
		 System.out.println(patient);
		 abc.registerShutdownHook(); // to invoke the destroy method just before the destruction of container
		 
		 
		
	}

}
