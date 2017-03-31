package com.company.operators;

import com.company.constructor.Dog;

public class Operators {
	
	static int i = 60;
	static int j = 13;
	static boolean bool1 = true;
	static boolean bool2 = false;
	
	String s = "StringTest";
	
	public static void main(String[] args){
		
		i = i+(j*4);
		System.out.println(i);
		
		String str = bool2 ? "Praven" : "Purna";
		
		if(bool2){
			str = "Praveen";
		}else{
			str = "Purna";
		}
		
//		System.out.println(str);
		
		Dog name = new Dog();

//		boolean result = name instanceof String;
//		System.out.println(result);
		
		boolean result1 = name instanceof Object;
		System.out.println(result1);
		
		boolean result2 = name instanceof Dog;
		System.out.println(result2);
	}
}
