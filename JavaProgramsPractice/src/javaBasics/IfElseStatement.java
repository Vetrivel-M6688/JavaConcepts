package javaBasics;

public class IfElseStatement {

	public static void main(String[] args) {
		
		//1. Greatest Number among 3!!
		int a = 45;
		int b = 45;
		int c = 45;
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println(c+" is greater");
		}
		else
		{
			System.out.println("Numvbers are equal");
		}
		
		//2. 2nd way of do the above prog
		int x=12;
		int y=32;
		int z=90;
		
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x+" is greater");
			}
		}
		if(y>x){
			if(y>z) {
				System.out.println(y+" is greater");
			}
		}
		if(z>x) {
			if(z>y) {
				System.out.println(z+" is greater");
			}
		}
		
	}

}
