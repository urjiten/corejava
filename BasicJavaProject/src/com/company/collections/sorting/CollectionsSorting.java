package com.company.collections.sorting;

import java.util.*;

public class CollectionsSorting {
public static void main(String args[])
{
	ArrayList<String> insects = new ArrayList<String>();
	insects.add("mosquito");
	insects.add("butterfly");
	insects.add("dragonfly");
	insects.add("fly");

	//---------------------------------------------------------------------------
	System.out.println("insects ArrayList in the normal state");
	for (int i=0; i<insects.size(); i++) {
	  System.out.println("insect " + i + " : " + (String) insects.get(i));
	}

	//---------------------------------------------------------------------------
	System.out.println();
	System.out.println("insects ArrayList in the sorted state");
	Collections.sort(insects);

	for (int i=0; i<insects.size(); i++) {
	  System.out.println("insect " + i + " : " + (String) insects.get(i));
	}
	//---------------------------------------------------------------------------
}
}
