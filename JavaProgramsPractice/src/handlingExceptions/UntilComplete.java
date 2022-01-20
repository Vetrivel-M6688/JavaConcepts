package handlingExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UntilComplete {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		UntilComplete uc = new UntilComplete();
		// uc.arithmeticException();
		System.out.println("enter the numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(uc.arithmeticExceptionWithreturnandFinally(a, b));
	}

	private int arithmeticExceptionWithreturnandFinally(int a, int b) {
		try {
			return a / b;
		} finally {
			System.out.println("I am finally, executing even the programe has RETURN statement");
		}
	}

	private void arithmeticException() {
		try {
			System.out.println("Enter the numbers to do the calculation: ");
			int val1 = scan.nextInt();
			int val2 = scan.nextInt();
			int result = val1 / val2;
			System.out.println("Result is: " + result);
		} catch (ArithmeticException ae) {
			System.out.println("Check your Divisor, it should not be \"0\" !!!");
			arithmeticException();
		}
	}

}
