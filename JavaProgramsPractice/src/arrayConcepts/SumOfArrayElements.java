package arrayConcepts;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the No of elements you want: ");
		int n = scan.nextInt();

		int[] arr = new int[n];
		
		System.out.println("Enter your Array Elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int sum=0;
		for (int num : arr) {
			sum = sum+num;
		}	
		
		System.out.println("Sum of Array: "+sum);
	}
}


