package com.app.java1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.java2.JavaConfigFile;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac= new AnnotationConfigApplicationContext(JavaConfigFile.class); 
		Student std=(Student)ac.getBean("myobj1");
		System.out.println(std);
		Student std2=(Student)ac.getBean("myobj2");
		System.out.println(std2);
	}

}
