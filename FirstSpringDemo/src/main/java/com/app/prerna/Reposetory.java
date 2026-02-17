package com.app.prerna;

public class Reposetory {
	
	//Dependencies........
	
	String name; //ptd property name
	
	int id; //ptd property name

	public Reposetory() {
		super();
	}

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

	@Override
	public String toString() {
		return "Reposetory [name=" + name + ", id=" + id + "]";
	}
	
	
	

}
