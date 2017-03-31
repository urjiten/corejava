package com.company.varargs;

public class VarArgsTest {

	public static void main(String[] args) {
		
		int total = add(2);
		System.out.println(total);
		
		int total2 = add(2,4,6);
		System.out.println(total2);
		
	}
	
	public static int add(int... ints){//variable arguments or varargs
		int total = 0;
		for(int i : ints){
			total = total + i;
		}
		
		return total;
	}
	
//	public static int add(int a, int b){
//		return a + b;
//	}
//	
//	public static int add(int a, int b, int c){//method overloading
//		return a + b + c;
//	}

}
