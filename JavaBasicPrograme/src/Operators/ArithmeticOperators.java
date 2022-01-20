package Operators;

public class ArithmeticOperators {
	
	
	public static void main(String[] args) {
		/*
		   +   -    *   /    %
		 */
		
		//addition
		//int c = 100 +50;
		int a = 100;
		int b = 50;
		int c = a + b; 
		System.out.println("addition : "+c);
		
		
		//multiplication
		c =  a * b;
		System.out.println("Subraction :"+c);
		
		//subraction
		c = a - b;
		c = a - a;
		c = -(b-a);
		System.out.println("mins :"+c);
		
		//divition
		c = a / b;
		//c = 1/0;
		c = 151/2;
		System.out.println("div :"+c);
		
		//mod  (it will be return the remainder value)
		c = 3%2; //2 (0,1)
		System.out.println("mod 1 :"+c);
		
		c = 8%3; ///  3 (0,1,2)
		System.out.println(" mod 2 :"+c);
		
	}

}
