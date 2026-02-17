package com.prerna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
					Student s=(Student)ac.getBean("aa");
					System.out.println(s.getName());
					System.out.println(s.getPhone());
					System.out.println(s.getAddresses());
					System.out.println(s.getCourses());
					
	}

}
