package com.app.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beanscope.xml");
		Student s1= (Student)ac.getBean("std") ;
		System.out.println(s1);
		Student s2= (Student)ac.getBean("std") ;
		System.out.println(s2);
		Student s3= (Student)ac.getBean("std") ;
		System.out.println(s3);
		// in xml file if we mention scope as a singleton then we get same output but if we mention prototype then we get different output 

		
	}
}
