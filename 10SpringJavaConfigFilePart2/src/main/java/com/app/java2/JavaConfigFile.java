package com.app.java2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.java1.Student;

@Configuration
public class JavaConfigFile {
	
	@Bean(name="myobj1")
	public Student std1() {
		
		Student s1=new Student();
		s1.setName("Prerna");
		s1.setAge(25);
		return s1;
	}
	@Bean(name="myobj2")
	public Student std2() {
		Student s2=new Student();
		s2.setName("Mini");
		s2.setAge(26);
		return s2;		
	}

}
