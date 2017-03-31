package com.company.loops;

public class ForLoop {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		for(int i=0; i<5; i++){
//			System.out.println(intArray[i]);
		}
		
		
		for(int i : intArray){//enhance forloop or foreach
			System.out.println(i);
		}
		
		String [] names ={"James", "Larry", "Tom", "Lacy"};
	      
	      for( String name : names ) {
	         System.out.print( name );
	         System.out.print(",");
	      }

	}

}
