package com.company.encapsulation;

public class Employee {
	
	public String name;
	private double salary;
	
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void getEmployerType(){
		System.out.println("Employee Name is : "+name);
		System.out.println(name+" is a "+ getEmployeeType());
	}
	
	private String getEmployeeType() {

		if(salary < 70000) {
			return "Developer";
		}
		if(salary > 70000 && salary < 80000){
			return "Manager";
		}
		if(salary > 80000 && salary < 100000){
			return "Director";
		}
		if(salary > 100000){
			return "Executive";
		}
		
		return null;
	}
}
