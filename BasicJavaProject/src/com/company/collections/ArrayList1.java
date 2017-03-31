package com.company.collections;

import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		/**
		 * ARRAYLIST
		 * 
		 * Null values allowed.
		 * Elements stored in the same order as they are inserted.
		 * Duplicate elements allowed.
		 * 
		 */
		// Create a new ArrayList
		ArrayList list1 = new ArrayList();
		
		ArrayList<String> lstString=new ArrayList<String>();

		// Add some objects to the ArrayList
		list1.add("obj1");
		list1.add("obj2");
		list1.add("obj3");

		// Insert a duplicate element
		list1.add("obj3");
		list1.add(new Integer(1));
		/* 
		 * Add an object to the ArrayList at a particular desired location.
		 * All other objects shift accordingly to accomodate the newly added object.
		*/
		list1.add(0, "obj0");

		// Null values allowed in an ArrayList
		list1.add(null);

		//Create an ArrayList of size 50
		ArrayList al2 = new ArrayList(50);
		al2.trimToSize();

//		String[] str=new String[10];
		
		// Search for an object in the ArrayList
		if (list1.contains("obj1")) {
			int index1 = list1.indexOf("obj1");
			System.out.println("index of obj1-->" + index1);
			System.out.println("Retrieved thru index call-->"
					+ list1.get(index1));

		}
		
//		List l1=list1.subList(0, 1);
//		List l2=list1.subList(2,2);

		// Iterate through the List using an Iterator
		Iterator iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println("List : Iterator -->" + iterator1.next());
		}
		
		int lSize=list1.size();
		for(int i=0;i<lSize;i++){
			Object obj=list1.get(i);
			
			if(obj instanceof Integer){
				Integer i1=(Integer)obj;
				System.out.println("Integer->"+i1);
			}
		}
//		-------------------
		//Enhanced for loop
		List<String> lstString1=new ArrayList<String>();
		lstString1.add("abc");
		lstString1.add("def");
//		lstString1.add(new Integer(1));
		
		for(String str : lstString1){
			System.out.println(str);
		}
		
		//--------------------
		
		
		
		//Iterate through the List using a ListIterator
		//List Iterator - previous() and hasPrevious()
		ListIterator listIterator1=list1.listIterator();
		while(listIterator1.hasNext())
		{
			Object obj1=listIterator1.next();
			System.out.println("List: ListIterator : Next -->"+obj1);
			
			if(listIterator1.hasPrevious())
			{
				System.out.println("List: ListIterator : Previous -->"+listIterator1.previous());
				break;
			}
		}
		
		

	}
}
