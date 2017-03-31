package com.company.abstraction;

public abstract class Car implements Vehicle{
	
	public Car(){
		System.out.println("Car is created");
	}
	
	public abstract void doors();
	
	public abstract void engine();
	
	public void tires(){
		System.out.println("Car has 4 tires");
	}
}
