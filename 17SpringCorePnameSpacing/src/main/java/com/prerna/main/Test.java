package com.prerna.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prerna.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Student obj=(Student)ac.getBean("stdId");
		System.out.println(obj);		
		
	}
}


