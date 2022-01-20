package javaBasics;

public class InterviewForLoop {

	public static void main(String[] args) {

		//Type 1: Print 1 to 100 without using any number inside the code
		/*int one = 'A'/'A';
		String str ="1234567890";
		int strLength = str.length();
		System.out.println("String length is :"+strLength);
		
		for(int i=one; i<=(strLength * strLength); i++) {
			System.out.println(i);
		}*/
		
		//Type 2: Print 1 to 100 without using ASCII value instead of number
		
		/*int one = 'A'/'A';
		for(int i=one; i<='d'; i++) { // 'a'=97, 'b'=98, 'c'=99, 'd'=100
			System.out.println(i);
		}*/
		
		// Q1:T1: printNum(1);
		// Q1:T1: printNumbers(1, 100);
		
	}
	//Question 1: Type 1: Print 1 to 100 without using any loop
	//we are out of the main because we use RECURSIVE(it call by itself within the Method) function here
	/*public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}*/
	//Question 1: Type 2: Print 1 to 100 without using any loop
	
	public static void printNumbers(int startNum, int endNum) {
		if(startNum<=endNum) {
			System.out.println(startNum);
			startNum++;
			printNumbers(startNum, endNum);
		}
	}
	
	
	
	

}
