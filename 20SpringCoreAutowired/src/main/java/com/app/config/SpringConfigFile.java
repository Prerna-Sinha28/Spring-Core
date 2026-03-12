package com.app.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.Address;
import com.app.Student;
import com.app.Subject;
@Configuration
public class SpringConfigFile {
	@Bean
	public Address createObj() {
		Address adr=new Address();
		adr.setHouseno(111);
		adr.setCity("Jaipur");
		adr.setPincode(302021);
		return adr;
	}
	@Bean
	public Student stdId() {
		Student st=new Student();
		st.setName("Prerna Sinha");
		st.setId(11);
		st.setMarks(100);
		//st.setAddress(createObj());
		return st;
	}
	@Bean
	public Subject sub() {
		Subject sub=new Subject();
		List<String>l1=new ArrayList<>();
		l1.add("c");
		l1.add("Java");
		l1.add("Python");
		l1.add("Data Science");
		sub.setMysubjects(l1);
		return sub ;
		
	}

}
