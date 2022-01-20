package Operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		//  ? :  (similar type of  IF then ELSE)
		// storing datatype and expression values should be match  
		
		int a = 50;
		int b = 100;
		int c;
		
		//  ctn.,    exp1  exp2
		c = (a==b) ? 555 : 666;
		System.out.println("c :"+c);
 		
		c = (a!=b) ? (a*b) : (a/b);
		System.out.println("c 1 :"+c);
		
		String s1 = "Java";
		String s2 = "Oracle";
		String s3;
		s3 = (s1==s2) ? "Datatbase" : "Frontend";
		System.out.println("s3 :"+s3);
		
		
	}
}
