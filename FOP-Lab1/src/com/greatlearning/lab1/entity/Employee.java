package com.greatlearning.lab1.entity;

// An entity class Employee is created to define the entities and attributes
public class Employee {

	// Define String variables firstName, lastName
	private String firstName;
	private String lastName;

	// Define a parameterized constructor which initialize firstName, lastName on object creation
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Define getter and setter methods for firstName, lastName
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

}
