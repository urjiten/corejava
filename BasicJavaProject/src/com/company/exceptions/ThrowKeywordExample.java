package com.company.exceptions;

public class ThrowKeywordExample {

	static void validate(int age){ 
		if(age<18){
			throw new ArithmeticException("not valid age to vote");//unchecked exception
		}
		else {
			System.out.println("welcome to vote");
		}
	} 
	
	public static void main(String args[]){ 
		try{
			validate(10);
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		System.out.println("rest of the code..."); 
	} 
	
}
