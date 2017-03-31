package com.company.exceptions;

import java.io.FileNotFoundException;

public class CheckedUncheckedException {

	public static void main(String[] args) {
		System.out.println("Calling checked Exception");
		try {
			readDataFromFile("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Calling unchecked exception method");
		divide(5,0);
		
		System.out.println("End of all exceptions");
	}

	private static void readDataFromFile(String fileName) throws FileNotFoundException {
		if(fileName.isEmpty()){
			throw new FileNotFoundException("File is not found");
		}
	}

	private static int divide(int i, int j) {
		if(j==0){
			throw new ArithmeticException("Second param cannot be zero");
		}else{
			return i/j;
		}
		
	}
}
