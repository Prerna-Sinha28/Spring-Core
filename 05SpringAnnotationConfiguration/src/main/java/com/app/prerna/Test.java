package com.app.prerna;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	//First create the empty container
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		
		//2. find all the classes from given base package and sub package
		
		ac.scan("com.app.prerna");
		
		//3. refresh the container
		
		ac.refresh();
		
		//4 Read the object
		
			HandlerInfo hb		=ac.getBean("hob", HandlerInfo.class);
		//5.Print the object
			
			System.out.println(hb); //toString()
	}

}
