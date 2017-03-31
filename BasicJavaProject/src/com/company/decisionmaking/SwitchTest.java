package com.company.decisionmaking;

public class SwitchTest {

	public static void main(String[] args) {// java SwitchTest B

		char grade = args[0].charAt(0);

	      switch(grade)
	      {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	        	 System.out.println("Good"); 
		            break;
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	      
	      int i = 5;
	      switch(i)
	      {
	      case 2:
	    	  System.out.println("Value is 2");
	      case 5:
	    	  System.out.println("Value is 5");
	    	  break;
	      default:
	    	  System.out.println("Value is default");
	      }
	}

}
