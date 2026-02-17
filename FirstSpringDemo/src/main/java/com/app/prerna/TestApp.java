package com.app.prerna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// ClassPathXmlConfiguration
public class TestApp {
	public static void main(String[] args) {
		
		//It is an interface......
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
			Reposetory repository =	(Reposetory)ac.getBean("aa");
		
				System.out.println(repository);
		
	}

}
