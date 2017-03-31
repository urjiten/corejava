package com.company.decisionmaking;

public class IfElseTest {

	public static void main(String[] args) {

		int x = 25;

//	      if( x == 10 ){
//	         System.out.print("Value of X is 10");
//	      }else if( x == 20 ){
//	         System.out.print("Value of X is 20");
//	      }else if( x == 30 ){
//	         System.out.print("Value of X is 30");
//	      }else{
//	         System.out.print("This is else statement");
//	      }
	      
	      
	      if(x < 50){
	    	  if(x < 20){
	    		  System.out.println("Value is less than 20");
	    	  }else{
	    		  if( x < 15){
	    			  
	    		  }
	    		  System.out.println("Value is less than 50, but more than 20");
	    	  }
	      }
	}

}
