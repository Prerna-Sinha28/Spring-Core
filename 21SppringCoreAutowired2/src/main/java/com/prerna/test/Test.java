package com.prerna.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prerna.Student;
import com.prerna.config.SpringConfigFile;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std=(Student)ac.getBean("student");
		System.out.println(std);
	
	}

}
