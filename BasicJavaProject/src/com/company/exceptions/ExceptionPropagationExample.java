package com.company.exceptions;

public class ExceptionPropagationExample {
	
	public static void main(String args[]){ 
		ExceptionPropagationExample obj=new ExceptionPropagationExample();
		obj.firstMethod();
		System.out.println("normal flow...");
	} 
	
	void firstMethod(){
		try{
			secondMethod();
		}
		catch(Exception e){
			System.out.println("exception handled");
			e.printStackTrace();
		}
	} 
	
	void thirdMethod(){ 
		int value=50/0; 
		System.out.println("Value:"+value);
	} 
	
	void secondMethod(){
		thirdMethod();
	} 
	
	
}
