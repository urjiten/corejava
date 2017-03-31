package com.company.autoboxingunboxing;

import java.util.ArrayList;


public class MyClass {

	public static void main(String args[])
	{
		ArrayList a=new ArrayList();
		int i=4;
		
		//Autoboxing
		a.add(i); 
		
		a.add(new Integer(i));
		
		Integer i1=4;//Integer i1=new Integer(4);
		Integer i2=5;//Integer i2=new Integer(5);
		
		int res=i1+i2; 
		
		//Unboxing
		int res2=i1.intValue() + i2.intValue();
	}
}
