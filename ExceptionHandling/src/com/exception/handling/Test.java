package com.exception.handling;

public class Test {

	public static void main(String[] args) {
		
		try {
			validate(12);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void validate(int age) throws InvalidAgeException {

		if (age >= 18) {

		System.out.println("welcome");
		}else{
			throw new InvalidAgeException("must be 18 or older");
		}

	}

}
