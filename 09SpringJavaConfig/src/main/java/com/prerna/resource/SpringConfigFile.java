package com.prerna.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prerna.Student;



@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student stdBean(){
		Student std=new Student();
		std.setName("Prerna");
		std.setRollno(2);
		return std;
	}
	

}
