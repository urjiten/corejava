package com.innowake.customtype;

// represents an employee;
public class Employee {

	private String firstName;
	private String lastName;
	private String ssn;

	public Employee(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public Employee() {
	}

	// we want instances to be usable within the collections API, therefore, we
	// implement equals
	public boolean equals(Employee e) {
		return firstName == e.firstName && lastName == e.lastName && ssn == e.ssn;
	}

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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	// Added toString Method for Employee.
	@Override
	public String toString() {
		return "\n  Employee:\n  	firstName=" + firstName + "\n  	lastName=" + lastName + "\n  	ssn=" + ssn ;
	}

}