package com.company.exceptions;

public class MultipleCatchBlocksExample {
	
	public static void main(String[] args) {
		 try{ 
			 int a[]=new int[5]; 
			 System.out.println("Divide by zero:"+50/0);
			 System.out.println("a[5] is :"+a[5]);
		 } 
		 catch(ArithmeticException e){
			 System.out.println("First Catch Block");
		 } 
		 catch(ArrayIndexOutOfBoundsException e){
			 System.out.println("Second Catch Block");
		 } 
		 catch(Exception e){
			 System.out.println("Third Catch Block");
		 } 
		 System.out.println("rest of the code..."); 

	}

}
