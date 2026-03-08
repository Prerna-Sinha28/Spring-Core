package com.prerna.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prerna.Student;
import com.prerna.config.SpringConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
		Student obj=(Student)ac.getBean("std");
		System.out.println(obj);		
		
	}
}


