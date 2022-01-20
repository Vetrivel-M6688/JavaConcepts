package handlingExceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * "IndexOutOfBondsExceptions" class is enough to catch the StringIndexOutOfBound and ArrayIndexOutOfBound Exception classes, 
 * like how the Exception is a parent for all different exception for catch them
 */

public class MultipleCatch {

	public static void main(String[] args) {
		MultipleCatch mc = new MultipleCatch();
		mc.multipleCatchBlocks();
	}

	public void multipleCatchBlocks() {
		try {
			Scanner scan = new Scanner(System.in);

			// Arithmetic Operation
			System.out.println("Enter for arithmetic Operation: ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int result = a/b;
			System.out.println("Result Divide is: "+result);

			// NullPointer Operation
			System.out.println("Enter the String value to Check NullPointer");
			String value = scan.next();
			System.out.println("No Null given, so Length is: "+value.length());

			// NumberFormat Operation
			System.out.println("Enter the value to convert to Integer");
			String StringVal = scan.next();
			int IntVal = Integer.parseInt(StringVal);
			System.out.println("Converted String value is: "+IntVal);

			// InputMismatch Operation
			System.out.println("Enter the Only String name: ");
			String name = scan.next();
			System.out.println("Name is: "+name);

			// ArrayIndexoutOfBounds Operation
			int[] nums = {10,20,30};

			for(int i=0; i<nums.length; i++) {
				System.out.println("Enter the index within the Array length:"+nums.length);
				int index = scan.nextInt();
				System.out.println(nums[index]);
				if(index<=2) {
					break;
				}
			}
			
			// StringIndexOutOfBounds operation
			System.out.println("Enter your String here with space included:");
			String yourLine = scan.nextLine(); //27 indexes
			yourLine+=scan.nextLine();				// yourLine = yourLine + "input Line"
			System.out.println("Size of the given String includes Space: "+yourLine.length());
			for(int i=0; i<yourLine.length(); i++) {
				System.out.println("Enter the Index to get the char, give index below:"+yourLine.length());
				int indexPos = scan.nextInt();
				System.out.println(yourLine.charAt(indexPos));
				if(indexPos<=27) {
					break;
				}
			}
			
			// IndexOutOfBounds Operations
			ArrayList<Integer> numList = new ArrayList<Integer>();
			int inputs;
			System.out.println("Enter the numbers to add in the list:");
			for(int i=0; i<4; i++) {
				inputs = scan.nextInt();
				numList.add(inputs);
			}
			System.out.println(numList);
			System.out.println("Size Of the List is: "+numList.size());
			for(int i=0; i<numList.size(); i++) {
				System.out.println("Enter the index to get the value within the size: "+numList.size());
				int indexCount = scan.nextInt();
				System.out.println(numList.get(indexCount));
				if(indexCount<=numList.size()) {
					break;
				}
			}
			scan.close();
		} catch (ArithmeticException e) {
			System.out.println("I am executing bcz of arithmetic method failed and the Exception is:");
			e.printStackTrace();
		} catch (NullPointerException n) {
			System.out.println("Im executing bcz of nullpointer method failed and the Exception is:");
			n.printStackTrace();
		} catch (NumberFormatException f) {
			System.out.println("Im executing bcz of numberformat exception method failed and the Exception is:");
			f.printStackTrace();
		} catch (InputMismatchException m) {
			System.out.println("Im executing bcz of inputmismatch exception method failed and the Exception is:");
			m.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException arr) {
			System.out.println("Im executing bcz of Arrayindexoutofbounds exception method failed and the Exception is:");
			arr.printStackTrace();
		} catch (StringIndexOutOfBoundsException St) {
			System.out.println("Im executing bcz of Stringindexoutofbounds exception method failed and the Exception is:");
			St.printStackTrace();
		} catch (IndexOutOfBoundsException Li) {
			System.out.println("Im executing bcz of Indexoutofbounds exception method failed and the Exception is:");
			Li.printStackTrace();
		}

	}
}
