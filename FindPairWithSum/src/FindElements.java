class FindElements {

	private static final int MAX = 100000; // Max size of Hashmap

	// Main to test the above function
	public static void main(String[] args) {
		int A[] = { 0, 1, 4, 45, 6, 10, 8, 12, 11, 3, 2, 15 };
		int n = 16;
		printpairs(A, n);
	}

	static void printpairs(int arr[], int sum) {
		// Declares and initializes the whole array as false
		FindElements fe = new FindElements();

		System.out.println("Pair with given sum " + sum + " is ");
		
		for (int i = 0; i < arr.length; i++) {

			int temp = sum - arr[i];

			// checking for condition
			boolean isPresent = fe.findElement(arr,temp);

			if (temp >= 0 && isPresent) {
				System.out.println("(" + temp + ", " + arr[i] + ")");
			}

		
		}
	}

	public boolean findElement(int arr[], int a) {
		boolean isPresent = false;
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				isPresent = true;
			}

		}

		return isPresent;

	}

}