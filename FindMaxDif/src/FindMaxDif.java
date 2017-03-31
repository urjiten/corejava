import java.util.Scanner;


public class FindMaxDif {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("No of elements: ");
		int n = s.nextInt();
		
		int a[] = new int [n];
		
		System.out.println("enter elements: ");
		for(int i = 0;i<n;i++){
			a[i]=s.nextInt();
		}
		
		int max = maxDifference(a);
		System.out.println(max);
		
	}
	
	 static int maxDifference(int[] a) {
	        int maxdif =0;
	        int maxi =0;
	        int max=0;
	        int min =2147483647;
	       
	        for(int i=0; i<a.length;i++){
	            if(a[i]>max){
	            	max= a[i];
	                 maxi= i;
	                }
	             }
	        for(int j = 0;j<maxi;j++){
	        	
	        	if(a[j]<min){
	        		min = a[j];
	        		
	        	}
	        }
	        
	        
	        return max-min;
	    }

}
