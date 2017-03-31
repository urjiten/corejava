package com.company.loops;

public class WhileLoop {
	
	public static void main(String args[]){
		
		int[] intArray = {1, 2, 3, 4, 5};
		int i = 0;
		
		while(i<5){
			
			System.out.println(intArray[i]);
			i++;
		}
		System.out.println("End Of While");
		
		int x = 10;
	      do{
	         System.out.print("value of x : " + x );
	         x++;
	         System.out.print("\n");
	      }while( x < 20 );
	}
}
