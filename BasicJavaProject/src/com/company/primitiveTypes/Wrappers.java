package com.company.primitiveTypes;

public class Wrappers {

	public static void main(String[] args) {
		Wrappers wrapper = new Wrappers();
		wrapper.run();
	}

	private void run() {
		int counter = 9;
		Integer wrapperInt = new Integer(counter);
		System.out.println(wrapperInt.intValue());
		System.out.println("Max Value:"+wrapperInt.MAX_VALUE);
		
		
		Integer stringInt = new Integer("12");
		System.out.println(stringInt.intValue());
	}

}
