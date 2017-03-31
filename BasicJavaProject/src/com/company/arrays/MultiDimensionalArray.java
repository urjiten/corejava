package com.company.arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//declaring and initializing 2D array 
		//1 2 3 6
		//2 4 5 
		//4 4 5
		
				int mutiDimensionalArray[][]={{1,2,3, 6},{2,4,5},{4,4,5}}; 
				//printing 2D array 
//				System.out.println(mutiDimensionalArray[1][2]);
				for(int i=0;i<3;i++){
					for(int j=0;j<4;j++){
						try{
							System.out.print(mutiDimensionalArray[i][j]+" ");
						}catch(Exception e){
							System.out.print("The value is not in the array");
						}
						} 
					System.out.println(); 
				}
				
			
	}

}
