package com.company.polymorphism;

import com.company.interfaces.BMW;
import com.company.interfaces.Car;
import com.company.interfaces.Scooter;
import com.company.interfaces.Vehicle;

public class CarTest {

	public static void main(String[] args) {
				
		//Polymorhism - Dyanmic Refrencing
		Vehicle vehicle1=new Car();
		vehicle1.engine();//Car
		vehicle1.toString();//Object
		
		//Polymorhism - Dynamic Refrencing
		Vehicle vehicle2=new Scooter();
		vehicle2.engine();
		
		//Polymorhism - Dynamic Refrencing
		Car car = new BMW();
		car.engine();
		car.tires();
	}

}
