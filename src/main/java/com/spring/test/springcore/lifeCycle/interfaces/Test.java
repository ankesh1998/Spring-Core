package com.spring.test.springcore.lifeCycle.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext abc = new ClassPathXmlApplicationContext("com/spring/test/springcore/lifeCycle/interfaces/config.xml");
		 Patient patient = (Patient) abc.getBean("patient");
		
		 System.out.println(patient);
		 abc.registerShutdownHook(); // to invoke the destroy method
	}

}
