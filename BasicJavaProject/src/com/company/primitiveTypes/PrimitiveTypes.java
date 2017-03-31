package com.company.primitiveTypes;

public class PrimitiveTypes {
	
	byte b = 123;
	short s;//default 0
	int i = 1234567890;
	long l = 1234567890123456789L;
	
	float f = 12.34f;
	double d = 123243423.445543;
	
	boolean bool;
	char ch = 'A';
	
	private void go() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(f);
		System.out.println(d);
		
		
		System.out.println(bool);
		bool = true;
		System.out.println(bool);
		System.out.println(ch);
	}

	public static void main(String[] args) {
		PrimitiveTypes primitive = new PrimitiveTypes();
		primitive.go();
	}
	
	

}
