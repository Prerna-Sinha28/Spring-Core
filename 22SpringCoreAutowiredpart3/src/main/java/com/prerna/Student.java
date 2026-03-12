package com.prerna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("Prerna")
	private String name;
	@Value("111")
	private int id;
	@Value("11")
	private int rollno;
	@Autowired
	private Address adress;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", rollno=" + rollno + ", adress=" + adress + "]";
	}
	
	

}
