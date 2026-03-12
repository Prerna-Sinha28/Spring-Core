package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Student;
import com.app.config.SpringConfigFile;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std=(Student) ac.getBean("stdId");
		System.out.println(std);
	}

}
