package com.prerna;

public class Student {
	
	private String name;
	private int rollno;
	private Address adress;
	
	
	public Student(String name, int rollno, Address adress) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.adress = adress;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "address= "+ adress+"]";
	}
	

}
