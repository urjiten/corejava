package com.company.string;

public class StringComparisonExample {
	
	public static void main(String[] args) {
		
		//By equals() method
		String s1="Sachin"; 
		String s2="Sachin";
		String s3=new String("Sachin"); 
		String s4="Saurav"; 
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false 
		
		//By == operator
		String s5="Sachin"; 
		String s6="Sachin"; 
		String s7=new String("Sachin");
		System.out.println(s5==s6);//true (because both refer to same instance)
		System.out.println(s5==s7);//false(because s3 refers to instance created in nonpool) 
		
		//By compareTo() method
		String s8 = "Sachin"; 
		String s9 = "Sachin";
		String s10 = "Ratan"; 
		System.out.println(s8.compareTo(s9));//0
		System.out.println(s8.compareTo(s10));//1(because s8>s10)negative
		System.out.println(s10.compareTo(s8));//-1(because s10 < s8 ) positve
	}

}
