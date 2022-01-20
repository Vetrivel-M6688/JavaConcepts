package handlingExceptions;

public class ThrowsClass2 extends ThrowsClass{

	public static void main(String[] args) {

		ThrowsClass2 tc2= new ThrowsClass2();
		tc2.arrayMethodCheck();
		
	}
	
	// Now the programmer get to know that "methodForAnotherClass" has an exception, so he need to handle it
	private void arrayMethodCheck() throws ArrayIndexOutOfBoundsException{
		try {
			methodForAnotherClass();
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Your trying to get out of Index, Please use indexes 0, 1, 2");
			aie.printStackTrace();
		}
	}

}
