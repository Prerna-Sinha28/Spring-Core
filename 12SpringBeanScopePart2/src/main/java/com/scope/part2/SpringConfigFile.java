package com.scope.part2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.scope.part1.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	@Scope("singleton")
	public Student stdObj() {
		Student std=new Student();
		std.setName("Prerna sinha");
		std.setId(101);
		return std;
		
		
	}
	

}
