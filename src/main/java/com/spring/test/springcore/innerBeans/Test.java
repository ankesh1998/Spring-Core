package com.spring.test.springcore.innerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context	= new ClassPathXmlApplicationContext("com/spring/test/springcore/innerBeans/config.xml");
	 Employee employee = (Employee) context.getBean("emp");
	 System.out.println(employee);
	}
}
