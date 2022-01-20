package Operators;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
			// && (and)      || (or)
		
		  // && (and operator ==> condition must be true)
		
			int a = 100;
			int b = 50;
			
			boolean bn = (a==100) && (b>100) && (b!=a);
			System.out.println("&& 1:"+bn);
			
			String s1 = "Java";
			String s2 = "Oracle";
			
			bn = (s1==s2) && (s1=="Java") && (s2=="Oracle");
			System.out.println("&& 2:"+bn);
			
			
			//|| (or oepartor ==> it will return true if any one condition is satisfied

			//    true			false	true
			bn = (a==100) || (b>100) || (b!=a);
			System.out.println("|| 1 :"+bn);
			
			bn = (a!=100)  || (s1==s2) || (b<20);
			System.out.println("|| 2 :"+bn);
			
			
			//&&   ||
			int m = 200;
			int n = 100;
			char h = 'A';
			char g = 'a';
			
			bn = ((m>n) && (n>100)) || (h==g);
			System.out.println("bn :"+bn);
			
			bn = (m>n) && ((n>=100) || (h==g));
			System.out.println("bn > :"+bn);
						
			
	}

}
