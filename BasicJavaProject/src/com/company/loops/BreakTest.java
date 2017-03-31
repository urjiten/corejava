package com.company.loops;

public class BreakTest {

	public static void main(String[] args) {

		int[] intArray = {1, 2, 3, 4, 5};
		
		for(int i=0; i<5; i++){
			System.out.println(intArray[i]);
			if(i==3)
				break;
		}
		System.out.println("After For loop");
		///

		
		String [] names ={"James", "Larry", "Tom", "Lacy"};
	      
	      for( String name : names ) {
	    	 if(name.equals("Tom")) {
	    		 continue;
	    	 }
	         System.out.print( name );
	         System.out.print(",");
	      }
	      System.out.println("After 2nd For Loop");
	}

}
