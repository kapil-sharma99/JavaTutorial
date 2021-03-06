package com.kapilsharma.oops.level2;

public class Person {
	private String name;
	private String email;
	private String phoneNumber;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return String.format("Name: %s, Email: %s, Phone Number: %s", name, email, phoneNumber);
	}
}
