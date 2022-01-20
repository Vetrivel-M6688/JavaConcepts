package handlingExceptions;

import java.util.InputMismatchException;

public class HandlingRunTimeExceptions extends RuntimeExceptions {

	public static void main(String[] args) {

		HandlingRunTimeExceptions he = new HandlingRunTimeExceptions();
		he.tryCatchArithmetic();
		he.tryCatchNullPointerException();
		he.tryCatchNumberFormatException();
		he.tryCatchInputMismatchException();
		he.tryCatchIndexOutOfBoundsException();
		he.tryCatchArrayIndexOtOfBoundsException();
		he.tryCatchStringIndexOtOfBoundsExceptions();
	}

	public void tryCatchArithmetic() {
		try {
			arithmeticException();
		} catch (ArithmeticException a) {
			System.out.println("Any Number Cannot be divided by Zero, so please give other number inplace of ZERO!!");
			a.printStackTrace();
		}
	}
	public void tryCatchNullPointerException() {
		try {
			nullPointerException();
		} catch (NullPointerException n) {
			System.out.println("String value is NULL so Give any String to Concatanation with "+newName);
			n.printStackTrace();
		}
	}
	
	public void tryCatchNumberFormatException() {
		try {
			numberFormateException();
		} catch (NumberFormatException f) {
			System.out.println("Cannot change String alphabets to Integer, Please check again");
			f.printStackTrace();
		}
	}
	public void tryCatchInputMismatchException() {
		try {
			inputMismatchException();
		} catch (InputMismatchException i) {
			System.out.println("No Matching Input found");
			i.printStackTrace();
		}
	}
	public void tryCatchIndexOutOfBoundsException() {
		try {
			indexOutOFBoundException();
		} catch (IndexOutOfBoundsException in) {
			System.out.println("List index you mentioned out of bounds");
			in.printStackTrace();
		}
	}
	public void tryCatchArrayIndexOtOfBoundsException() {
		try {
			arrayIndexOutOfBoundException();
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Given Index exceeds in the Array");
			ai.printStackTrace();
		}
	}
	public void tryCatchStringIndexOtOfBoundsExceptions() {
		try {
			stringIndexOutOfBoundException();
		} catch (StringIndexOutOfBoundsException s) {
			System.out.println("your trying to get the index which is not within the length");
			s.printStackTrace();
		}
		
	}

}
