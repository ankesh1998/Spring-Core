package com.spring.test.springreftype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext abc = new ClassPathXmlApplicationContext("com/spring/test/springreftype/config.xml");
		 Student student = (Student) abc.getBean("student");
		
		 System.out.println(student);
	}

}
