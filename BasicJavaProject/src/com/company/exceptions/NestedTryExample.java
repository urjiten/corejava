package com.company.exceptions;

public class NestedTryExample {
	static String str;
	
	public static void main(String[] args) {
		try{ 
			try{ 
				System.out.println("Divide by 0"+5/0);
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic Exception: "+e);
			} 
			try{ 
				int a[]=new int[5];
				System.out.println("Out of bounds:"+a[5]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array Index Out of Bounds Exception: "+e);
			} 
			System.out.println("other statement");
			try{
				System.out.println("Accessing a null object:"+str.toString());
			}catch(NullPointerException e){
				System.out.println("Null Pointer Exception: "+e);
			}
			
		}catch(Exception e){
			System.out.println("Generic Exception: "+e);
		} 
		
		System.out.println("After Try Catch..."); 
		
	}

}
