package handlingExceptions;

public class ThrowsClass {

	/*
	 * THROW keyword have to be declare in the method(method calling the another
	 * method which may occurs Exception), until we handle the method
	 */
	public static void main(String[] args) {
		ThrowsClass tc = new ThrowsClass();
		tc.handlingThrows();
		tc.methodForAnotherClass();
		System.out.println("line to check the programe flow.....");
	}

	// this method does not need the THROWS keyword, because we handle that
	// particular exception
	// we can also have THROWS keyword, no issues.......
	private void handlingThrows() {
		// Calling the withoutHandling2 method and handle it by try and catch
		try {
			withoutHandlingThrows2();
		} catch (ArithmeticException ae) {
			System.out.println("Cannot divide a number / Zero");
			ae.printStackTrace();
			System.out.println("Default message thrown by Exception: "+ae.getMessage());
		}
	}

	// Intimating that this method might face an Exception, because this method
	// calling the withoutHandlingThrows1(), which may have an Exception
	private void withoutHandlingThrows2() throws ArithmeticException {
		// Calling the withoutHandlingThrows method
		withoutHandlingThrows1();
	}

	// a method has divisor value 0, so an Exception may occur but not handled
	private void withoutHandlingThrows1() throws ArithmeticException {
		int a = 20;
		int b = 0;
		int res = a / b;
		System.out.println("Result is: " + res);
	}
	
	// the following method has Checked exception and the programmer aware of it
	// and this method will be used by new Programmer in his own another class
	// he might not aware of this exception, for the information to him we used THROWS keyword here,
	void methodForAnotherClass() {
		int[] a = {10,20,30};
		System.out.println(a[5]);
	}

}
