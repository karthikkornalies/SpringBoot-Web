package com.example.service;

public class User {
	
	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName;
	
	public User(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString(){
		return this.firstName+" "+this.lastName;
	}
	
}
