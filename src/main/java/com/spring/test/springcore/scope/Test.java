package com.spring.test.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/springcore/scope/config.xml");
		Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee.hashCode());

		Employee employee2 = (Employee) context.getBean("emp");
		System.out.println(employee2.hashCode());
	}
}
