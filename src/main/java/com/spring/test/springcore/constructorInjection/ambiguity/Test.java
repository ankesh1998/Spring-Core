package com.spring.test.springcore.constructorInjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/springcore/constructorInjection/ambiguity/config.xml");
		Addition add = (Addition) context.getBean("addition");
		System.out.println(add);
	}

}
