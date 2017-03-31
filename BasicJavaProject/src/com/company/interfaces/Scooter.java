package com.company.interfaces;

public class Scooter implements Vehicle {

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Engine in Scooter");

	}

	@Override
	public void tires() {
		// TODO Auto-generated method stub
		System.out.println("Tires in Scooter 2");

	}
	
	public void helmet(){
		System.out.println("You need helmet for scooter");
	}

	@Override
	public void motorMethod() {
		// TODO Auto-generated method stub
		
	}

}
