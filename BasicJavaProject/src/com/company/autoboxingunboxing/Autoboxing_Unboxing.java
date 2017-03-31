package com.company.autoboxingunboxing;

public class Autoboxing_Unboxing {
	public static void main(String args[]) {

		// The Integer is unboxed to an int, the two are added and then the sum
		// is autoboxed into a new Integer.
		Integer i1 = new Integer(9);
		Integer i2 = new Integer(12);
		
		
//		 int primi1=i1.intValue();//unboxing
//		 int primi2=i2.intValue();
//		 int prim_result=primi1+primi2;
//		 
//		 
//		 Integer result= new Integer(prim_result); //boxing
		 
		Integer result = i1 + i2;
//		int result = i1.intValue() + i2.intValue();
		
		
		//Result is of Type Integer. To get the int value : result.intValue();
		System.out.println("Result :" + result);
	}
}
