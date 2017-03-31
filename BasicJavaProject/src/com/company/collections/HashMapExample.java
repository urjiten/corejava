package com.company.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<Integer, String>(); 
		
		hm.put(100,"Amit");
		hm.put(101,"Vijay"); 
		hm.put(102,"Rahul");
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext()){
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		} 
		
		int score = 60;
		
		if(score == 80){
			System.out.println("Distinction");
		}
		if(score == 60){
			System.out.println("Very good");
		}
		if(score == 50){
			System.out.println("Good");
		}
		if(score == 40){
			System.out.println("Need improvement");
		}
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(80, "Distinction");
		map.put(60, "Very Good");
		map.put(50, "Good");
		map.put(40, "Need improvement");
		
		String str = map.get(score);
	}

}
