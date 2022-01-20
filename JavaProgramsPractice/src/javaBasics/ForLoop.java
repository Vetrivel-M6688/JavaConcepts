package javaBasics;

public class ForLoop {


	public static void main(String[] args) {
		// Type 1
		/*
		 * for(int i=1; i<=5; i++) { for(int j=1; j>=5; j++) { System.out.print("i"); }
		 * System.out.println(); }
		 */

		// Type 2: Using break statement
		/*
		 * for(int i=0; i<=50; i++) { System.out.println(i); if(i==20) { break; } }
		 */

		// Type 3: Printing Even Number until 50
		/*
		 * for(int i=1; i<=100; i++) { if(i%2==0) { System.out.println(i); if(i==50) {
		 * break; } } }
		 */
		
		// Type 4: Sum of even Number in the range 1 to 50
		int sum=0;
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
	}

}
