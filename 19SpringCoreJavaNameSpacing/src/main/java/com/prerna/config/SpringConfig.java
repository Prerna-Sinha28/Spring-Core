package com.prerna.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prerna.Address;
import com.prerna.Student;
@Configuration
public class SpringConfig {
	@Bean
	public Address createAddObj() {
		Address adr=new Address();
		adr.setHouseno(123);
		adr.setCity("Pune");
		adr.setPincode(111111);
		return adr;
		
	}
	
	@Bean
	public Student std(){
		Student s1=new Student();
		s1.setName("Prerna Sinha");
		s1.setRollno(111);
		s1.setAdress(createAddObj());
		return s1;
	}

}
