package com.company.exceptions;

import java.io.IOException;

public class ThrowsKeywordExample {

	void method() throws IOException{ 
		// do something
		//
		throw new IOException("File Not Found");
	} 
		
	public static void main(String[] args) {
//		try{ 
			ThrowsKeywordExample t=new ThrowsKeywordExample();
			t.anotherMethod();
//		}
//		catch(Exception e){
//			System.out.println("Exception Handled: "+ e);
//		} 
		System.out.println("After Try Catch...."); 
	}
	
	private void anotherMethod(){
		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
