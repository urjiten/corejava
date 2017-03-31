package com.company.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
	      String strReverse;
	      StringBuilder sb = new StringBuilder();
	      StringTokenizer st = new StringTokenizer(str,"d");
	   
	      while (st.hasMoreTokens()) {
	         sb.insert(0, st.nextToken());
	         if (st.hasMoreTokens()) {
	            sb.insert(0, " ");
	         }
	      }
	      strReverse = sb.toString();
	      System.out.println(strReverse);
	}

}
