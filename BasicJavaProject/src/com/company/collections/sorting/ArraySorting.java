package com.company.collections.sorting;

import java.util.*;

/**
 * This example shows sorting using Arrays.sort()
 * This kind of sort can be implemented for String objects.
 *
 */
public class ArraySorting {
public static void main(String args[])
{
	String animals[] = new String[4];
	animals[0] = "snake";
	animals[1] = "kangaroo";
	animals[2] = "wombat";
	animals[3] = "bird";

	//---------------------------------------------------------------------------
	System.out.println("animals[] array in the normal state");
	for (int i=0; i<4; i++) {
	  System.out.println("animal " + i + " : " + animals[i]);
	}
	System.out.println();
	//---------------------------------------------------------------------------
	System.out.println("animals[] array in the sorted state");
	Arrays.sort(animals);

	for (int i=0; i<4; i++) {
	  System.out.println("animal " + i + " : " + animals[i]);
	}
	//---------------------------------------------------------------------------
}
}
