package com.kadum;

public class Name {
	private String firstName;
	private String lastName;
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Name() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
