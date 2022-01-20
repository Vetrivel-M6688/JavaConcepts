package Operators;

public class AssignmentOperator{
	
	public static void main(String[] args) {
		
		//   =    +=  -=    *=   /=
		
		//=   store the value temporarly)
		int a = 100; 
		
		a = a + 100;
		System.out.println("= opeartor :"+a);
		
		//+=
		int b = 50;
		b  += 50;  // b = b +50;
		System.out.println("+= opeartor :"+b);
		
		//-=
		int c = 200;
		c -= 100;
		System.out.println("-= opeartor :"+c);
		
		//*= 
		int d = 300;
		d *= 10;
		System.out.println("*= opeartor :"+d);
		
		//  /=
		int e = 50;
		e /= 2;
		System.out.println("/= opeartor :"+e);
		
		//  %=
		int f = 8;
		f  %= 3;
		System.out.println("%= operator :"+f);
		
		
	}

}
