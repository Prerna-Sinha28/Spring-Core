package com.scope.part1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.scope.part2.SpringConfigFile;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student s1= (Student)ac.getBean("stdObj");
		System.out.println(s1);
		Student s2= (Student)ac.getBean("stdObj");
		System.out.println(s2);

		
	}

}
