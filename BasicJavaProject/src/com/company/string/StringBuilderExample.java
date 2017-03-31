package com.company.string;

public class StringBuilderExample {	
	
	//String Builder is Not Synchronized	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" ");
		builder.append("World !!!");
		System.out.println(builder);
		
	}

}
