package com.company.string;

public class StringExample {

	public static void main(String[] args) {
		String s = "Hello ";
		s.concat(" Will");//Hello Will
		System.out.println("String is "+s);//Hello
		s = s.concat(" Smith");//Hello Smith
		System.out.println("First String is "+s);// Hello Smith
		
		String r = "Hello" + " World !!!";
		System.out.println("Second String is "+r);//Hello World
	}

}
