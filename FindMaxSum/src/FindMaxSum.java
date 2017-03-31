import java.io.IOException;
import java.util.Scanner;

public class FindMaxSum {

	public static void main(String[] args) throws IOException {

		// Used Scanner to take input for user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int arraySize = scan.nextInt();
		int[] a = new int[arraySize];
		int n = 0;

		// Number of elements must be smaller or equals to array Size .
		System.out.println("Enter the Number of element");
		n = scan.nextInt();
		System.out.println("Enter the array");

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		int sum = maxSubSum(a);
		System.out.println("The maximum sub array's elements sum is:" + sum);
	}

	public static int maxSubSum(int[] array) {
		int maxSum = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (maxSum < sum) {
				maxSum = sum;
			} else if (sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}

}
