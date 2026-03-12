package com.prerna;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	private String name;
	private int id;
	private int rollno;
	private Address adress;
	public Student(@Value("Prerna")String name,@Value("111") int id, @Value("11")int rollno , Address adress) {
		super();
		this.name = name;
		this.id = id;
		this.rollno = rollno;
		this.adress=adress;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", rollno=" + rollno + ", adress=" + adress + "]";
	}
	
	

}
