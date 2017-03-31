package com.company.interfaces;

public class Car implements Vehicle,Motor {

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Engine in Car");

	}

	@Override
	public void tires() {
		// TODO Auto-generated method stub
		System.out.println("There are 4 Tires in Car");

	}
	
	public void trunk(){
		System.out.println("You have trunk space in a car");
	}

	@Override
	public void motorMethod() {
		// TODO Auto-generated method stub
		
	}

}
