package com.company.generics;

import com.company.constructor.Dog;

public class GenericsExample {
	// generic method printArray                         
	   public static <E> void printArray( E[] inputArray )
	   {
	      // Display array elements              
	         for ( E element : inputArray ){        
	            System.out.printf( "%s ", element );
	         }
	         System.out.println();
	    }

	    public static void main( String args[] )
	    {
	        // Create arrays of Integer, Double and Character
	        Integer[] intArray = { 1, 2, 3, 4, 5 };
	        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	        String[] strArray = {"abc", "def"};
	        Dog dog1 = new Dog();
	        Dog dog2 = new Dog();
	        Dog[] dogs = {dog1, dog2};

	        System.out.println( "Array integerArray contains:" );
	        printArray( intArray  ); // pass an Integer array

	        System.out.println( "\nArray doubleArray contains:" );
	        printArray( doubleArray ); // pass a Double array

	        System.out.println( "\nArray characterArray contains:" );
	        printArray( charArray ); // pass a Character array
	        
	        printArray(strArray);
	        printArray(dogs);
	    } 
}
