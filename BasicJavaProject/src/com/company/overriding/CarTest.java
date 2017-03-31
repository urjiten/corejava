package com.company.overriding;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car();
		car.engine();
		car.tires();
		
		SUV suv = new SUV();
		suv.engine();
		suv.tires();
	}

}
