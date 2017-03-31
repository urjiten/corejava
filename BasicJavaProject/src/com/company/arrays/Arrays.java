package com.company.arrays;

public class Arrays {

	public static void main(String[] args) {

		Arrays arrays = new Arrays();
		arrays.run();
	}

	private void run() {
		
		int[] intArray = new int[5];
		int intArray2[] = {3,8};
		
		intArray[0] = 5;
		intArray[1] = 2;
		
//		System.out.println(intArray);
		System.out.println(intArray[2]);
		
		System.out.println(intArray2[2]);
		
	}

}
