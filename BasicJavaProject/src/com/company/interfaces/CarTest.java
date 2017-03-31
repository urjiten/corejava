package com.company.interfaces;

public class CarTest {

	public static void main(String[] args) {
		
//		BMW bmw = new BMW();
//		bmw.engine();
//		bmw.tires();
//		bmw.trunk();
//		bmw.models();

		Car car=new Car();
		car.engine();
		car.tires();
		car.trunk();
		
		Scooter scooter=new Scooter();
		scooter.engine();
		
		//Polymorhism - Dyanmic Refrencing
		Vehicle vehicle1=new Car();
		vehicle1.engine();
		vehicle1.tires();
		
		//Polymorhism - Dynamic Refrencing
		Vehicle vehicle2=new Scooter();
		vehicle2.engine();
	}

}
