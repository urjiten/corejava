package com.company.collections;

import java.util.*;

public class HashSet1 {
	public static void main(String args[]) {
		HashSet hashset = new HashSet();
	

		// 'Hello' is duplicate and the last 'Hello' wont be inserted in any
		// - of the Set implementations.
		String text = "Hello how are you today sir Hello";
		// ----------------------------------------------------
		/**
		 * HASHSET
		 * 
		 * No ordering of elements done. 
		 * 
		 * Elements not stored in the order in which they are inserted. 
		 * This is because elements are stored in the HashSet by a hashing alogrithm.
		 * 
		 * Null values allowed.
		 * 
		 * Not Synchronized.
		 */
		System.out.println("-------------HASHSET------------------");
		StringTokenizer st = new StringTokenizer(text);
		while (st.hasMoreTokens()) {
			hashset.add(st.nextToken());
		}
		// Add a null element to the hashset
		hashset.add(null);

		// Iterator for hashset
		// Adds elements in any order
		Iterator hashIterator = hashset.iterator();
		while (hashIterator.hasNext()) {
			System.out.print(hashIterator.next() + " ");
		}
		System.out.println();
		
		//Convert HashSet to Array of objects.
		Object hashSetObjectArray[]=hashset.toArray();
		for(int i=0;i<hashSetObjectArray.length;i++)
		{
			System.out.println("Hash Set Object Array-->"+hashSetObjectArray[i]);
		}
		System.out.println();
		
		//Remove all the elements from the HashSet.
		hashset.clear();
		System.out.println("HashSet size after clearing all elements-->"+hashset.size());
	}
}
