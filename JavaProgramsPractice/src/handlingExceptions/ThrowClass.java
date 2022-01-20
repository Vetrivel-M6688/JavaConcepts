package handlingExceptions;

import java.util.Scanner;

public class ThrowClass extends Exception {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		int yourAge = scan.nextInt();
		cutomeException(yourAge);
	}

	public static void cutomeException(int age) {
		try {
			if (age < 18) {
				throw new Exception("Your nor eligible to vote");
			} else {
				System.out.println("Your eligible to vote");
			}
		} catch (Exception e) {
			System.out.println(age + " is not eligible to vote, you have to be greater than 18");
			e.printStackTrace();
		}

	}
}
