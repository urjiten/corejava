package com.company.exceptions;

public class ExceptionExample {
	
	public static void main(String[] args) {
		ExceptionExample ex = new ExceptionExample();
		ex.run(0);
	}
	
	public void  run(int i){
		try{
			int value = 50/i;
			System.out.println("Value:"+value);
			
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Generic Exception");
			e.printStackTrace();
		}
		
		System.out.println("After handling exception");
	}

}
