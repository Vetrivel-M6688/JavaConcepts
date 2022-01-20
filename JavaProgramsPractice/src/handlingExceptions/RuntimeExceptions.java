package handlingExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RuntimeExceptions {
	
	String newName; 

	public static void main(String[] args) {

		RuntimeExceptions re = new RuntimeExceptions();
		re.arithmeticException();
		//re.nullPointerException();
		//re.numberFormateException();
		//re.inputMismatchException();
		//re.stringIndexOutOfBoundException();
		//re.indexOutOFBoundException();
		//re.arrayIndexOutOfBoundException();
	}
	
	public void arithmeticException() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the values: ");
		int value1= scan.nextInt();
		int value2 = scan.nextInt();
		int result = value1/value2;
		System.out.println("Result is: "+result);
		scan.close();
	}
	public void nullPointerException() {
		
		String name = null;
		newName = "\"Join With Me\"";
		System.out.println(name.concat(newName));
	}
	public void numberFormateException() {
		
		String stringVal = "123ABC";
		System.out.println("String value: "+stringVal);
		
		int intVal = Integer.parseInt(stringVal);
		System.out.println("Integer value: "+intVal);
	}
	public void inputMismatchException() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Integer value: ");
		int val = scan.nextInt();
		System.out.println("Your value is: "+val);
		scan.close();
	}
	public void stringIndexOutOfBoundException() {
		
		String quote = "No pain No gain";
		System.out.println("Tot length of the String is: "+quote.length());
		System.out.println("Fetching the charecter at Index 16: "+quote.charAt(16));
	}
	public void indexOutOFBoundException() {
		
		List dataList = new ArrayList<>();
		dataList.add(12);
		dataList.add('M');
		dataList.add("Name");
		dataList.add(true);
		dataList.add(12.56f);
		
		System.out.println(dataList.get(3));
		System.out.println(dataList.get(5));
	}
	public void arrayIndexOutOfBoundException() {
		String[] names = new String[5];
		names[0] = "Java";
		names[1] = "Oracle";
		names[2] = "SQL";
		names[3] = "Selenium";
		
		System.out.println("Array Length: "+names.length);
		
		// below statement will not throw an exception even though it has only 4 values out of 5, because
		// the size is fixed up to 5
		System.out.println(names[4]);
		System.out.println(names[5]);
	}
	
}
