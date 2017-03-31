package com.company.overloading;

public class Addition {

	public static void main(String[] args) {

		Addition addition = new Addition();
		int total2 = addition.add(3, 5);
		System.out.println("Adding 2 numbers : "+ total2);
		
		int total3 = addition.add(3, 5, 7);
		System.out.println("Adding 3 numbers : "+ total3);
		
		String str2 = addition.add("Hello ", "Praveen");
		System.out.println("Adding 2 strings : "+ str2);
		
		String str3 = addition.add("Hello ", "Mr ", "Praveen");
		System.out.println("Adding 3 strings : "+ str3);
	}

	private int add(int i, int j) {
		return i+j;
	}

	private int add(int i, int j, int k) {
		return i + j + k;
	}

	private String add(String string, String string2) {
		return string + string2;
	}

	private String add(String string, String string2, String string3) {
		return string + string2 + string3;
	}
}
