package com.company.abstraction;

public class Coupe extends Car{

	@Override
	public void doors() {

		System.out.println("Coupe has a two doors");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Coupe has engine v6");
	}

}
