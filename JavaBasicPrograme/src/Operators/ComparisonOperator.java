package Operators;

public class ComparisonOperator {
	
	public static void main(String[] args) {
		
		//  >   >=    <    <=    !=   == 
		
		
		//
		short u1 = 50;
		short u2 = 60;
		boolean u3 = (u1>u2);
		System.out.println("u3 :"+u3);
		
		// >  (greater than)  
		int a = 100;
		int b = 50;
		//int c = a > b;
		boolean z = (a > b);  /// 51 + above, it ignore exact value(50) 
		System.out.println(" > :"+z);
		
		//  <  (lesser than)
		z  = (a < b);    // 49 + below,  it ignore exact value(50)
		System.out.println(" < :"+z);
		
		// >= 
		a = 100;
		b = 100;
		z = (a >= b);  // 100+ above ( it will check exact value and above)
		System.out.println(" >= :"+z);
		
		// <=
		z = (a <= b);
		System.out.println(" <= :"+z);
		
		
		// == (check only exact value, means matching or not)
		z = (a==b);
		System.out.println(" == :"+z);
		a = 101;
		b = 100;
		z = (a == b);
		System.out.println(" == :"+z);
		
		//!=  (it will return true if the condition is not matching)
		z = (a!=b);
		System.out.println("!= :"+z);
		
		
		
	}

}
