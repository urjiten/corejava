package com.company.autoboxingunboxing;

import java.util.*;
public class Autoboxing {

	public static void main(String args[])
	{
		//AutoBoxing
		ArrayList arrList=new ArrayList();
		arrList.add(2);//Conversion: int --> Integer
		arrList.add(true);//Conversion: boolean --> Boolean
		arrList.add('c');//Conversion: char --> Character
		arrList.add(22.4);//Conversion: double --> Double
		arrList.add("Praveen");
		
		Iterator arrIterator=arrList.iterator();
		while(arrIterator.hasNext())
		{
			Object obj=arrIterator.next();
			if(obj instanceof Integer)
			{
				Integer I1=(Integer)obj;
				System.out.println("Integer: "+obj);
				int i1=I1.intValue();
				System.out.println("integer: "+i1);
				System.out.println();
			}
			else if(obj instanceof Boolean)
			{
				Boolean B1=(Boolean)obj;
				System.out.println("Boolean: "+B1);
				boolean b1=B1.booleanValue();
				System.out.println("boolean: "+b1);
				System.out.println();
			}
			else if(obj instanceof Character)
			{
				Character C1=(Character)obj;
				System.out.println("Character: "+C1);
				char c1=C1.charValue();
				System.out.println("char: "+c1);
				System.out.println();
				
			}
			else if(obj instanceof Double)
			{
				Double D1=(Double)obj;
				System.out.println("Double: "+D1);
				double d1=D1.doubleValue();
				System.out.println("double: "+d1);
				System.out.println();
			}
			else{
				System.out.println(obj);
			}
		}

	}
	
}
