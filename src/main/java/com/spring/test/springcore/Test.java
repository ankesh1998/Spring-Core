package com.spring.test.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext abc = new ClassPathXmlApplicationContext("com/spring/test/springcore/config.xml");
		 Employee emp = (Employee) abc.getBean("emp");
		 System.out.println("Employee Id : "+emp.getId());
		 System.out.println("Employee Name : "+emp.getName());
	}

}
