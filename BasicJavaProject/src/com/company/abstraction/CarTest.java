package com.company.abstraction;


/**
 * @author Praveen
 * THis is a Car Test Class
 */
public class CarTest {

	/**
	 * THis is a main method in Car Test
	 * @param args
	 */
	public static void main(String[] args) {

		//using abstract class 0 to 100% abstraction
		Car car = new Coupe();
		car.doors();
		car.engine();
		car.tires();
		
		//using interface 100% abstraction
		Vehicle vehicle = new Coupe();
		vehicle.engine();
	}

}
