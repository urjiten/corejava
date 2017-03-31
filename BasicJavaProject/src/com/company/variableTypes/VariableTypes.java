package com.company.variableTypes;

public class VariableTypes {
	//instance vars
	int instanceInt;
	protected String instanceString="Praveen";
	
	static int staticInt = 10;

	public static void main(String[] args) {

		VariableTypes variableTypes = new VariableTypes();
//		System.out.println("Instance Int:"+variableTypes.instanceInt);
//		System.out.println("Instance String:"+variableTypes.instanceString);
		
		System.out.println("Static Int:"+staticInt);

		
		variableTypes.localVariablesMethod();
	}
	
	public void localVariablesMethod(){
		int localInt=5;
		String localString="Purna";
		System.out.println("Local Int:"+localInt);
		System.out.println("Local String:"+localString);
		
		System.out.println("Instance Int:"+instanceInt);
		System.out.println("Instance String:"+instanceString);
		
		System.out.println("Static  Int:"+staticInt);
	}

}
