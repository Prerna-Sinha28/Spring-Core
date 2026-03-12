package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private int id;
	private float marks;
	@Autowired
	private Address address;
	@Autowired
	private Subject subjects;
		public void setName(String name) {
		this.name = name;
	}
		public void setId(int id) {
		this.id = id;
	}
		public void setMarks(float marks) {
		this.marks = marks;
	}
//				public void setAddress(Address address) {
//			this.address = address;
//		}
//				public Subject getSubjects() {
//					return subjects;
//				}
//				public void setSubjects(Subject subjects) {
//					this.subjects = subjects;
//				}
				@Override
				public String toString() {
					return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", address=" + address
							+ ", subjects=" + subjects + "]";
				}
			
						

}
